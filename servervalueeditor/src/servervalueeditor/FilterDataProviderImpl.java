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

import ilog.rules.teamserver.brm.IlrRuleProject;
import ilog.rules.teamserver.model.IlrSession;
import ilog.rules.teamserver.web.beans.*;
import ilog.rules.webc.jsf.components.table.IlrUIDefaultTableModel;
import ilog.rules.webc.jsf.components.table.SortableTableModel;

import java.util.ArrayList;

/**
 * A very simple implementation of the provider
 * for the purpose of this sample.
 */
public class FilterDataProviderImpl implements FilterDataProvider {

    /*final static String[][] dataInfos = new String[][] {
            {"AADCVFD", "Free access to the park"},
            {"ADFGFVB", "Fidelity points"},
            {"BAGFDFF", "Free transportation miles"},
            {"BFGHFDF", "Special rebate for customer with a referral"},
            {"DFARSDG", "Small gift for customer with NO referral"},
            {"DFTYGFD", "Free Offer from California office"},
            {"GDFDSFB", "Free Offer from Texas office"},
            {"GNFDFSS", "Free Offer from Nevada office"},
            {"VDFDSFF", "Huge rebate for customer with a referral"},
            {"XSDFFSG", "Invitation for annual special event"},
            {"ZEREZRE", "Tickets for the opera"}
    }; */
	String[][] dataInfos = new String[][]{};
    /* Tries to fetch the values that correspond to the given pattern.
     *
     * @see servervalueeditor.CustomFilterDataProvider#getvalues(java.lang.String)
     */
    public Object[] getValues(String pattern) {

        ArrayList<String> vals = new ArrayList<String>();
        for (int i=0; i < dataInfos.length; i++) {
            if (dataInfos[i][0].toUpperCase().indexOf(pattern.toUpperCase()) >= 0) {
                vals.add(dataInfos[i][0]);
            }
        }
        return vals.toArray();
    }

    /*
     * @see servervalueeditor.CustomFilterDataProvider#getTextFromValue(java.lang.String)
     */
    public String getTextFromValue(String value) {
        String val = "";
        for (int i=0; i<dataInfos.length; i++) {
            if (dataInfos[i][0].equals(value))
                val = dataInfos[i][1];
        }
        return val;
    }
    //TJ Added 
    IlrSession session;
    IlrRuleProject project;
    DynamicDomainsBean domainsBean;
    IlrUIDefaultTableModel tableModel;
    SortableTableModel sortableTableModel;
    public FilterDataProviderImpl(){
    	ManagerBean mb= ManagerBean.getInstance();
    	session = mb.getSession();
    	project= mb.getWorkingProject();
    	domainsBean = DynamicDomainsBean.getInstance();
    	tableModel = domainsBean.getDynamicDomainsTableModel();
    	sortableTableModel= tableModel.getTableModel();
    	
    }
}
