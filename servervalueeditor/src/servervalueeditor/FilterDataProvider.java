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

/**
 * Interface to give filter items.
 */
public interface FilterDataProvider {


    /**
     * Gives the value corresponding to a given pattern.
     *
     * Any strategy can be applied here, such as mixing regular expressions
     * or database access.
     *
     * @param pattern The pattern.
     * @return An array of values corresponding to the given pattern.
     */
    public Object [] getValues(String pattern);

    /**
     * Returns the text to qualify the value.
     *
     * @param value The value.
     * @return The text associated with the value.
     */
    public String getTextFromValue(String value);

}
