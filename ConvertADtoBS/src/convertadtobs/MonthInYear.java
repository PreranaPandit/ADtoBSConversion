/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertadtobs;

import java.util.ArrayList;

/**
 *
 * @author Suhana
 */
public class MonthInYear {
    
    public static ArrayList<Integer[]>monthDays = new ArrayList<>();
	
	static {
	          monthDays.add(new Integer[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 
                30, 30});// 1970 
        monthDays.add(new Integer[]{31, 31, 32, 31, 32, 30, 30, 29, 30, 29, 
                30, 30});// 1971 
        monthDays.add(new Integer[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 
                30, 30});// 1972 
        monthDays.add(new Integer[]{30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 
                29, 31});// 1973 
        monthDays.add(new Integer[]{31, 31, 32, 30, 31, 31, 30, 29, 30, 29, 
                30, 30});// 1974 
        monthDays.add(new Integer[]{31, 31, 32, 32, 30, 31, 30, 29, 30, 29, 
                30, 30});// 1975 
        monthDays.add(new Integer[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 
                30, 31});// 1976 
        monthDays.add(new Integer[]{30, 32, 31, 32, 31, 31, 29, 30, 29, 30, 
                29, 31});// 1977 
        monthDays.add(new Integer[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 
                30, 30});// 1978 
        monthDays.add(new Integer[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 
                30, 30});// 1979 
        monthDays.add(new Integer[]{30, 32, 31, 32, 31, 30, 30, 30, 29, 29, 
                30, 31});// 1980 
        monthDays.add(new Integer[]{31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 
                30, 30});// 1981 
        monthDays.add(new Integer[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 
                30, 30});// 1982 
        monthDays.add(new Integer[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 
                30, 30});// 1983 
        monthDays.add(new Integer[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 
                30, 31});// 1984 
        monthDays.add(new Integer[]{31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 
                30, 30});// 1985 
        monthDays.add(new Integer[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 
                30, 30});// 1986 
        monthDays.add(new Integer[]{31, 32, 31, 32, 31, 30, 30, 29, 30, 29, 
                30, 30});// 1987 
        monthDays.add(new Integer[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 
                30, 31});// 1988 
        monthDays.add(new Integer[]{31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 
                30, 30});// 1989 
		monthDays.add(new Integer[]{30,31,32,31,31,31,30,29,30,29,30,30});  //1990
		monthDays.add(new Integer[]{31,32,31,32,31,30,30,29,30,29,30,30});  //1991
		monthDays.add(new Integer[]{31,32,31,32,31,30,30,30,29,30,29,30});  //1992		
		monthDays.add(new Integer[]{31,31,31,32,31,31,30,29,30,29,30,30});  // 1993
        monthDays.add(new Integer[]{31,31,31,32,31,31,30,29,30,29,30,30});// 1994
        monthDays.add(new Integer[]{31,31,31,32,31,31,30,29,30,29,30,30});// 1995
        monthDays.add(new Integer[]{31,31,31,32,31,31,30,29,30,29,30, 30});// 1996
        monthDays.add(new Integer[]{31,31,31,32,31,31,30,29,30,29,30,30});// 1997
        monthDays.add(new Integer[]{31,31,31,32,31,31,30,29,30,29,30,30});// 1998
        monthDays.add(new Integer[]{31,31,31,32,31,31,30,29,30,29,30,30});// 1999
        monthDays.add(new Integer[]{31,32,31,32,31,30,30,30,29,29,29,31});// 2000
        monthDays.add(new Integer[]{31,31,32,31,31,31,30,29,30,29,30,30});// 2001
        monthDays.add(new Integer[]{31,31,32,32,31,30,30,29,30,29,30,30});// 2002 366 days
        monthDays.add(new Integer[]{31,32,31,32,31,30,30,30,29,29,30,31});
        monthDays.add(new Integer[]{30,32,31,32,31,30,30,30,29,30,29,31});
        monthDays.add(new Integer[]{31,31,32,31,31,31,30,29,30,29,30,30});
        monthDays.add(new Integer[]{31,31,32,32,31,30,30,29,30,29,30,30});
        monthDays.add(new Integer[]{31,32,31,32,31,30,30,30,29,29,30,31});
        monthDays.add(new Integer[]{31,31,31,32,31,31,29,30,30,29,29,31});
        monthDays.add(new Integer[]{31,31,32,31,31,31,30,29,30,29,30,30});
        monthDays.add(new Integer[]{31,31,32,32,31,30,30,29,30,29,30,30});
        monthDays.add(new Integer[]{31,32,31,32,31,30,30,30,29,29,30,31});
        monthDays.add(new Integer[]{31,31,31,32,31,31,29,30,30,29,30,30});
        monthDays.add(new Integer[]{31,31,32,31,31,31,30,29,30,29,30,30});
        monthDays.add(new Integer[]{31,31,32,32,31,30,30,29,30,29,30,30});
        monthDays.add(new Integer[]{31,32,31,32,31,30,30,30,29,29,30,31});
        monthDays.add(new Integer[]{31,31,31,32,31,31,29,30,30,29,30,30});
        monthDays.add(new Integer[]{31,31,32,31,31,31,30,29,30,29,30,30});
        monthDays.add(new Integer[]{31,32,31,32,31,30,30,29,30,29,30,30});
        monthDays.add(new Integer[]{31,32,31,32,31,30,30,30,29,30,29,31});
        monthDays.add(new Integer[]{31,31,31,32,31,31,30,29,30,29,30,30});
        monthDays.add(new Integer[]{31,31,32,31,31,31,30,29,30,29,30,30});
        monthDays.add(new Integer[]{31,32,31,32,31,30,30,30,29,29,30,30});
        monthDays.add(new Integer[]{31,32,31,32,31,30,30,30,29,30,29,31});
        monthDays.add(new Integer[]{31,31,31,32,31,31,30,29,30,29,30,30});
        monthDays.add(new Integer[]{31,31,32,31,31,31,30,29,30,29,30,30});// 2025
        monthDays.add(new Integer[]{31,32,31,32,31,30,30,30,29,29,30,31});
        monthDays.add(new Integer[]{30,32,31,32,31,30,30,30,29,30,29,31});
        monthDays.add(new Integer[]{31,31,32,31,31,31,30,29,30,29,30,30});
        monthDays.add(new Integer[]{31,31,32,31,32,30,30,29,30,29,30,30});
        monthDays.add(new Integer[]{31,32,31,32,31,30,30,30,29,29,30,31});
        monthDays.add(new Integer[]{30,32,31,32,31,30,30,30,29,30,29,31});
        monthDays.add(new Integer[]{31,31,32,31,31,31,30,29,30,29,30,30});
        monthDays.add(new Integer[]{31,31,32,32,31,30,30,29,30,29,30,30});
        monthDays.add(new Integer[]{31,32,31,32,31,30,30,30,29,29,30,31});
        monthDays.add(new Integer[]{30,32,31,32,31,31,29,30,30,29,29,31});
        monthDays.add(new Integer[]{31,31,32,31,31,31,30,29,30,29,30,30});// 2036
        monthDays.add(new Integer[]{31,31,32,32,31,30,30,29,30,29,30,30});
        monthDays.add(new Integer[]{31,32,31,32,31,30,30,30,29,29,30,31});
        monthDays.add(new Integer[]{31,31,31,32,31,31,29,30,30,29,30,30});
        monthDays.add(new Integer[]{31,31,32,31,31,31,30,29,30,29,30,30});
        monthDays.add(new Integer[]{31,31,32,32,31,30,30,29,30,29,30,30}); // 2041
        monthDays.add(new Integer[]{31,32,31,32,31,30,30,30,29,29,30,31});
        monthDays.add(new Integer[]{31,31,31,32,31,31,29,30,30,29,30,30});
        monthDays.add(new Integer[]{31,31,32,31,31,31,30,29,30,29,30,30});
        monthDays.add(new Integer[]{31,32,31,32,31,30,30,29,30,29,30,30});
        monthDays.add(new Integer[]{31,32,31,32,31,30,30,30,29,29,30,31});
        monthDays.add(new Integer[]{31,31,31,32,31,31,30,29,30,29,30,30});
        monthDays.add(new Integer[]{31,31,32,31,31,31,30,29,30,29,30,30});// 2048
        monthDays.add(new Integer[]{31,32,31,32,31,30,30,30,29,29,30,30});
        monthDays.add(new Integer[]{31,32,31,32,31,30,30,30,29,30,29,31});
        monthDays.add(new Integer[]{31,31,31,32,31,31,30,29,30,29,30,30});
        monthDays.add(new Integer[]{31,31,32,31,31,31,30,29,30,29,30,30});// 2052
        monthDays.add(new Integer[]{31,32,31,32,31,30,30,30,29,29,30,30});
        monthDays.add(new Integer[]{31,32,31,32,31,30,30,30,29,30,29,31});
        monthDays.add(new Integer[]{31,31,32,31,31,31,30,29,30,29,30,30});
        monthDays.add(new Integer[]{31,31,32,31,32,30,30,29,30,29,30,30});
        monthDays.add(new Integer[]{31,32,31,32,31,30,30,30,29,29,30,31});
        monthDays.add(new Integer[]{30,32,31,32,31,30,30,30,29,30,29,31});
        monthDays.add(new Integer[]{31,31,32,31,31,31,30,29,30,29,30,30});
        monthDays.add(new Integer[]{31,31,32,32,31,30,30,29,30,29,30,30});// 2060
        monthDays.add(new Integer[]{31,32,31,32,31,30,30,30,29,29,30,31});
        monthDays.add(new Integer[]{30,32,31,32,31,31,29,30,29,30,29,31});
        monthDays.add(new Integer[]{31,31,32,31,31,31,30,29,30,29,30,30});
        monthDays.add(new Integer[]{31,31,32,32,31,30,30,29,30,29,30,30});
        monthDays.add(new Integer[]{31,32,31,32,31,30,30,30,29,29,30,31});
        monthDays.add(new Integer[]{31,31,31,32,31,31,29,30,30,29,29,31});
        monthDays.add(new Integer[]{31,31,32,31,31,31,30,29,30,29,30,30});
        monthDays.add(new Integer[]{31,31,32,32,31,30,30,29,30,29,30,30});
        monthDays.add(new Integer[]{31,32,31,32,31,30,30,30,29,29,30,31});
        monthDays.add(new Integer[]{31,31,31,32,31,31,29,30,30,29,30,30});// 2070
        monthDays.add(new Integer[]{31,31,32,31,31,31,30,29,30,29,30,30});
        monthDays.add(new Integer[]{31,32,31,32,31,30,30,29,30,29,30,30});
        monthDays.add(new Integer[]{31,32,31,32,31,30,30,30,29,29,30,31});
        monthDays.add(new Integer[]{31,31,31,32,31,31,30,29,30,29,30,30});
        monthDays.add(new Integer[]{31,31,32,31,31,31,30,29,30,29,30,30});
        monthDays.add(new Integer[]{31,32,31,32,31,30,30,30,29,29,30,30});
        monthDays.add(new Integer[]{31,32,31,32,31,30,30,30,29,30,29,31});
        monthDays.add(new Integer[]{31,31,31,32,31,31,30,29,30,29,30,30});
        monthDays.add(new Integer[]{31,31,32,31,31,31,30,29,30,29,30,30});
        monthDays.add(new Integer[]{31,32,31,32,31,30,30,30,29,29,30,30});// 2080
        monthDays.add(new Integer[]{31,31,32,32,31,30,30,30,29,30,30,30});// 2081
        monthDays.add(new Integer[]{31,32,31,32,31,30,30,30,29,30,30,30});// 2082
        monthDays.add(new Integer[]{31,31,32,31,31,30,30,30,29,30,30,30});// 2083
        monthDays.add(new Integer[]{31,31,32,31,31,30,30,30,29,30,30,30});// 2084
        monthDays.add(new Integer[]{31,32,31,32,31,31,30,30,29,30,30,30});// 2085
        monthDays.add(new Integer[]{31,32,31,32,31,30,30,30,29,30,30,30});// 2086
        monthDays.add(new Integer[]{31,31,32,31,31,31,30,30,29,30,30,30});// 2087
        monthDays.add(new Integer[]{30,31,32,32,30,31,30,30,29,30,30,30});// 2088
        monthDays.add(new Integer[]{31,32,31,32,31,30,30,30,29,30,30,30});// 2089
        monthDays.add(new Integer[]{31,32,31,32,31,30,30,30,29,30,30,30});// 2090
        monthDays.add(new Integer[]{31,31,32,31,31,31,30,30,29,30,30,30});// 2091
        monthDays.add(new Integer[]{31,31,32,32,31,30,30,30,29,30,30,30});// 2092
        monthDays.add(new Integer[]{31,32,31,32,31,30,30,30,29,30,30,30});// 2093
        monthDays.add(new Integer[]{31,31,32,31,31,30,30,30,29,30,30,30});// 2094
        monthDays.add(new Integer[]{31,31,32,31,31,31,30,29,30,30,30,30});// 2095
        monthDays.add(new Integer[]{30,31,32,32,31,30,30,29,30,29,30,30});// 2096
        monthDays.add(new Integer[]{31,32,31,32,31,30,30,30,29,30,30,30});// 2097
        monthDays.add(new Integer[]{31,31,32,31,31,31,29,30,29,30,30,31});// 2098
        monthDays.add(new Integer[]{31,31,32,31,31,31,30,29,29,30,30,30});// 2099
        monthDays.add(new Integer[]{31,32,31,32,30,31,30,29,30,29,30,30});// 2100
        
        
    }
    
}
