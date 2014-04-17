/*
* Licensed Materials - Property of IBM
* 5725-B69 5655-Y17 5724-Y00 5724-Y17 5655-V84
* Copyright IBM Corp. 1987, 2013. All Rights Reserved.
*
* Note to U.S. Government Users Restricted Rights: 
* Use, duplication or disclosure restricted by GSA ADP Schedule 
* Contract with IBM Corp.
*/

package servervalueeditor;

import ilog.webui.dhtml.IlxWComponent;
import ilog.webui.dhtml.IlxWPort;
import ilog.webui.dhtml.components.IlxWJavaAction;
import ilog.webui.dhtml.components.IlxWLabel;
import ilog.webui.dhtml.components.IlxWList;
import ilog.webui.dhtml.components.IlxWTextField;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * This class extends web components used to modelize a "Filter" editor.
 * It manages its items by using a filter data provider.
 */

public class FilterComponent extends IlxWComponent {


	private static final long serialVersionUID = 1L;

	private static Logger log = Logger.getLogger(FilterComponent.class.getName());

	private IlxWTextField inputVal;
	private IlxWList listVal;
	private IlxWLabel labelVal;
	private IlxWLabel title;
	private FilterDataProvider provider;
	private FilterTokenActionManager filterTokenActionManager;

  @SuppressWarnings("serial")
public FilterComponent(FilterDataProvider provider) {

    // Create and register the web components
    inputVal = new IlxWTextField() { public void invalidate() { } };
    inputVal.setName("input_value");
    inputVal.setColumns(9);
    inputVal.setEmptyText("");
    listVal = new IlxWList();

    listVal.setName("list_value");

    labelVal = new IlxWLabel();
    labelVal.setName("label_val");
    this.provider = provider;

    title = new IlxWLabel();
    title.setText("You can enter a pattern to filter the list");
    add(inputVal);
    add(listVal);
    add(labelVal);
    add(title);

    inputVal.setAction(null);
    // The onkeypress action will update the component from the pattern typed
    inputVal.setOnKeyPressAction(new IlxWJavaAction() {
    private static final long serialVersionUID = 1L;

	public void perform(IlxWPort port,
                          IlxWComponent source,
                          Object [] args) {
        int keyCode = -1;
        try {
          keyCode = Integer.valueOf((String) args[0]).intValue();
        } catch (NumberFormatException e) {
          e.printStackTrace();
        }
        updateComponents(inputVal.getText());
        if (keyCode == 13) {
          filterTokenActionManager.closeDialog(FilterTokenActionManager.OK_COMMAND);
        }
      }
    });

    // Add a listener on the list to display associated information
    listVal.addListSelectionListener(new ListSelectionListener() {
      public void valueChanged(ListSelectionEvent e) {
        log.log(Level.INFO, "value changed");
        updateLabelComponent();
      }
    });

    updateComponents("");
  }

  /**
   * Sets the value.
   */
  public void setValue(String value) {
    updateComponents(value);
  }

  /**
   * Returns the value of the selected item.
   */
  public String getValue() {
    return (String) listVal.getSelectedValue();
  }

  /**
   * Prints the HTML code.
   *
   * @see ilog.webui.dhtml.IlxWComponent#printComponent(ilog.webui.dhtml.IlxWPort)
   */
  protected void printComponent(IlxWPort port) throws IOException {

    log.log(Level.INFO, "FilterComponent: printComponent");
    PrintWriter out = port.getWriter();
    out.print("<table width=\"1%\">");
    out.print("<tr>");
    out.print("<td colspan=\"2\">");
    title.print(port);
    out.print("</td>");
    out.print("</tr>");
    out.print("<tr>");
    out.print("<td colspan=\"2\">");
    inputVal.print(port);
    out.print("</td>");
    out.print("</tr>");
    out.print("<tr>");
    out.print("<td>");
    listVal.print(port);
    out.print("</td>");
    out.print("<td valign=\"top\">");
    labelVal.print(port);
    out.print("</td>");
    out.print("</tr>");
    out.print("</table>");
    out.flush();
  }

  protected void updateComponents(String pattern) {
    Object[] values = provider.getValues(pattern != null ? pattern : "");

    listVal.setListData(values);
    if (values.length != 0 && values[0] != null) {
      listVal.setSelectedValue(values[0]);
      labelVal.setText(provider.getTextFromValue((String) values[0]));
    }
  }

  protected void updateLabelComponent() {
    String selected = (String) listVal.getSelectedValue();
    labelVal.setText(provider.getTextFromValue(selected));
  }

  public void setTokenActionManager(FilterTokenActionManager filterTokenActionManager) {
    this.filterTokenActionManager = filterTokenActionManager;
  }
}
