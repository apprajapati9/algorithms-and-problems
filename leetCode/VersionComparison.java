/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetCode;

import java.util.Arrays;

/**
 *
 * @author apprajapati
 */
public class VersionComparison {

    public static void main(String[] args) {

        String local = "12.1.1";
        String remote = "12.1.2";

        // islocalGreaterThanRemote(local, remote);
        int num = versionCompare(local, remote);
        boolean yesno = isUpdateNeeded(local, remote);
        System.out.println("num=" + num );
        if(yesno){
            System.out.println("yes");
        }else
            System.out.println("No");
        
        
        String mVersion = "1.21123123123.3.2.2.2";
        String trunc= getTrunctatedVersion(mVersion);
        System.out.println(trunc);
    }

    /**
     * Compares two version strings.
     *
     * Use this instead of String.compareTo() for a non-lexicographical
     * comparison that works for version strings. e.g. "1.10".compareTo("1.6").
     *
     * @note It does not work if "1.10" is supposed to be equal to "1.10.0".
     *
     * @param str1 a string of ordinal numbers separated by decimal points.
     * @param str2 a string of ordinal numbers separated by decimal points.
     * @return The result is a negative integer if str1 is _numerically_ less
     * than str2. The result is a positive integer if str1 is _numerically_
     * greater than str2. The result is zero if the strings are _numerically_
     * equal.
     * 
     *  -1 = str1 < str2
     *   1 = str1 > str2
     *   0 = str1 == str2
     */
    public static int versionCompare(String mLocal, String mRemote) {
        String[] vals1 = mLocal.split("\\.");
        String[] vals2 = mRemote.split("\\.");
        int i = 0;
        // set index to first non-equal ordinal or length of shortest version string
        while (i < vals1.length && i < vals2.length && vals1[i].equals(vals2[i])) {
            i++;
            System.out.println("i" + i);
        }
        // compare first non-equal ordinal number
        if (i < vals1.length && i < vals2.length) {
            System.out.println("vals1.length"  + vals1.length + " vals2.length" + vals2.length);
            int diff = Integer.valueOf(vals1[i]).compareTo(Integer.valueOf(vals2[i]));
            System.out.println("diff "  + diff + " vals[i]" + vals1[i] + " vals2[i]" + vals2[i]);

            return Integer.signum(diff);
        }
        // the strings are equal or one string is a substring of the other
        // e.g. "1.2.3" = "1.2.3" or "1.2.3" < "1.2.3.4"
        return Integer.signum(vals1.length - vals2.length);
    }
    
    private static boolean isUpdateNeeded(String currentVersion, String version) {
        String[] currentValues = currentVersion.split("\\.");
        String[] versionValues = version.split("\\.");

        for (int i=0 ; i<currentValues.length ; i++) {
            int currentNumber = Integer.parseInt(currentValues[i]);
            int versionNumber = Integer.parseInt(versionValues[i]);

            if (versionNumber > currentNumber) {
                return true;
            } else if (versionNumber < currentNumber){
                return false;
            }
        }

        return false;
    }
    
       public static String getTrunctatedVersion (String mVersion) { 
        
        String[] currentValues = mVersion.split("\\.");
        System.out.println(Arrays.toString(currentValues));
        if(currentValues.length > 2) {
            return currentValues[0] + "." + currentValues[1];
        }else
            return mVersion;
    } 

}
