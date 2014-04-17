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

import ilog.rules.brl.IlrBRLRuleEditingContext;
import ilog.rules.brl.value.descriptor.IlrValueDescriptor;
import ilog.rules.webui.IlrWValueEditorComponent;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 */
public class FilterValueEditor extends IlrWValueEditorComponent {

	FilterTokenActionManager filterActionManager;

	private static Logger log = Logger.getLogger(FilterValueEditor.class.getName());

	/**
	 * @param valueDescriptor The value descriptor.
	 */
	public FilterValueEditor(IlrValueDescriptor valueDescriptor) {
		super(valueDescriptor);
		log.log(Level.INFO, "Start FilterValueEditor");
		this.filterActionManager = new FilterTokenActionManager();

	}

	/* (non-Javadoc)
	 * @see ilog.rules.brl.value.editor.IlrValueEditorComponent#getEditorComponent(ilog.rules.brl.IlrBRLRuleEditingContext)
	 */
	public Object getEditorComponent(IlrBRLRuleEditingContext context) {
		return this.filterActionManager;
	}

	/* (non-Javadoc)
	 * @see ilog.rules.brl.value.editor.IlrValueEditor#getValue()
	 */
	public Object getValue() {
		return filterActionManager.getFilter().getValue();
	}

	/* (non-Javadoc)
	 * @see ilog.rules.brl.value.editor.IlrValueEditor#setValue(java.lang.Object)
	 */
	public void setValue(Object value) {
		filterActionManager.getFilter().setValue((String)value);
	}

}
