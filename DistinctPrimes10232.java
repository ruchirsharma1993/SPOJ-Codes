/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class DistinctPrimes10232 
{
    public static void main(String args[]) throws Exception
    {
        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
  
        String var[] = {"30","42","60","66","70","78","84","90","102","105","110","114","120","126","130","132","138","140","150","154","156","165","168","170","174","180","182","186","190","195","198","204","210","220","222","228","230","231","234","238","240","246","252","255","258","260","264","266","270","273","276","280","282","285","286","290","294","300","306","308","310","312","315","318","322","330","336","340","342","345","348","350","354","357","360","364","366","370","372","374","378","380","385","390","396","399","402","406","408","410","414","418","420","426","429","430","434","435","438","440","442","444","450","455","456","460","462","465","468","470","474","476","480","483","490","492","494","495","498","504","506","510","516","518","520","522","525","528","530","532","534","540","546","550","552","555","558","560","561","564","570","572","574","580","582","585","588","590","594","595","598","600","602","606","609","610","612","615","616","618","620","624","627","630","636","638","642","644","645","646","650","651","654","658","660","663","665","666","670","672","678","680","682","684","690","693","696","700","702","705","708","710","714","715","720","726","728","730","732","735","738","740","741","742","744","748","750","754","756","759","760","762","765","770","774","777","780","782","786","790","792","795","798","804","805","806","810","812","814","816","819","820","822","825","826","828","830","834","836","840","846","850","852","854","855","858","860","861","868","870","874","876","880","882","884","885","888","890","894","897","900","902","903","906","910","912","915","918","920","924","930","935","936","938","940","942","945","946","948","950","952","954","957","960","962","966","969","970","975","978","980","984","986","987","988","990","994","996","1001","1002","1005","1008","1010","1012","1014","1015","1020","1022","1023","1026","1030","1032","1034","1035","1036","1038","1040","1044","1045","1050","1054","1056","1060","1062","1064","1065","1066","1068","1070","1071","1074","1078","1080","1085","1086","1090","1092","1095","1098","1100","1102","1104","1105","1106","1110","1113","1116","1118","1120","1122","1128","1130","1131","1134","1140","1144","1146","1148","1150","1155","1158","1160","1162","1164","1166","1170","1173","1176","1178","1180","1182","1185","1188","1190","1194","1196","1197","1200","1204","1206","1209","1210","1212","1218","1220","1221","1222","1224","1230","1232","1235","1236","1239","1240","1242","1245","1246","1248","1254","1258","1260","1265","1266","1270","1272","1274","1275","1276","1278","1281","1284","1287","1288","1290","1292","1295","1298","1300","1302","1305","1308","1309","1310","1311","1314","1316","1320","1326","1330","1332","1334","1335","1338","1340","1342","1344","1350","1353","1356","1358","1360","1362","1364","1365","1368","1370","1374","1378","1380","1386","1390","1392","1394","1395","1398","1400","1404","1406","1407","1410","1414","1416","1419","1420","1422","1425","1426","1428","1430","1434","1435","1440","1442","1443","1446","1449","1450","1452","1455","1456","1460","1462","1463","1464","1470","1474","1476","1479","1480","1482","1484","1485","1488","1490","1491","1494","1495","1496","1498","1500","1505","1506","1508","1510","1512","1515","1518","1520","1524","1526","1530","1533","1534","1540","1542","1545","1547","1548","1550","1551","1554","1558","1560","1562","1564","1566","1570","1572","1575","1578","1580","1581","1582","1584","1586","1590","1595","1596","1598","1599","1602","1605","1606","1608","1610","1612","1614","1615","1617","1620","1624","1626","1628","1630","1632","1634","1635","1638","1640","1644","1645","1650","1652","1653","1656","1659","1660","1662","1665","1666","1668","1670","1672","1674","1677","1680","1683","1686","1690","1692","1694","1695","1698","1700","1702","1704","1705","1708","1710","1716","1720","1722","1725","1729","1730","1734","1736","1738","1740","1742","1743","1746","1748","1749","1750","1752","1755","1758","1760","1764","1767","1768","1770","1771","1776","1778","1780","1782","1785","1786","1788","1790","1794","1798","1800","1802","1804","1806","1810","1812","1815","1818","1820","1824","1826","1827","1830","1833","1834","1836","1840","1842","1845","1846","1848","1850","1854","1855","1860","1862","1866","1869","1870","1872","1876","1878","1880","1881","1884","1885","1886","1887","1890","1892","1896","1898","1900","1902","1904","1905","1908","1910","1911","1914","1918","1920","1924","1925","1926","1930","1932","1935","1938","1940","1946","1947","1950","1953","1955","1956","1958","1960","1962","1965","1968","1970","1972","1974","1976","1978","1980","1986","1988","1989","1990","1992","1995","1998","2001","2002","2004","2006","2010","2013","2014","2015","2016","2020","2022","2024","2028","2030","2034","2035","2037","2040","2044","2046","2050","2052","2054","2055","2058","2060","2064","2065","2067","2068","2070","2072","2074","2076","2079","2080","2082","2085","2086","2088","2090","2091","2093","2094","2100","2106","2108","2109","2110","2112","2114","2115","2118","2120","2121","2124","2128","2130","2132","2134","2135","2136","2139","2140","2142","2145","2146","2148","2150","2154","2156","2158","2160","2162","2163","2166","2170","2172","2175","2178","2180","2184","2185","2190","2193","2196","2198","2200","2202","2204","2205","2208","2210","2211","2212","2214","2220","2222","2223","2226","2230","2232","2233","2235","2236","2238","2240","2242","2244","2247","2250","2254","2255","2256","2260","2261","2262","2265","2266","2268","2270","2274","2275","2277","2278","2280","2282","2286","2288","2289","2290","2292","2294","2295","2296","2298","2300","2301","2310","2314","2316","2318","2320","2322","2324","2325","2328","2330","2331","2332","2334","2337","2338","2340","2343","2345","2346","2350","2352","2354","2355","2356","2358","2360","2364","2365","2366","2370","2373","2376","2378","2379","2380","2382","2385","2387","2388","2390","2392","2394","2397","2398","2400","2405","2406","2408","2409","2410","2412","2414","2415","2418","2420","2422","2424","2430","2431","2436","2438","2440","2442","2444","2445","2448","2450","2451","2454","2457","2460","2464","2465","2466","2470","2472","2475","2478","2480","2482","2484","2485","2486","2490","2492","2494","2496","2499","2502","2505","2506","2508","2510","2514","2516","2520","2522","2526","2530","2532","2534","2535","2538","2540","2541","2542","2544","2546","2548","2550","2552","2553","2555","2556","2562","2565","2568","2570","2574","2576","2580","2583","2584","2585","2586","2590","2595","2596","2598","2600","2604","2607","2610","2613","2616","2618","2620","2622","2625","2626","2628","2630","2632","2634","2635","2639","2640","2646","2650","2652","2655","2658","2660","2664","2665","2666","2667","2668","2670","2674","2676","2678","2679","2680","2682","2684","2685","2686","2688","2690","2691","2694","2695","2697","2698","2700","2702","2703","2706","2709","2710","2712","2714","2715","2716","2717","2718","2720","2724","2726","2728","2730","2736","2737","2739","2740","2742","2745","2748","2750","2751","2754","2755","2756","2758","2760","2765","2766","2769","2770","2772","2774","2775","2778","2780","2782","2784","2786","2788","2790","2793","2794","2795","2796","2800","2802","2805","2806","2808","2810","2812","2814","2820","2821","2822","2826","2828","2829","2830","2832","2834","2835","2838","2840","2842","2844","2847","2849","2850","2852","2856","2860","2862","2865","2868","2870","2871","2874","2877","2880","2882","2884","2886","2890","2892","2895","2898","2900","2904","2905","2907","2910","2912","2914","2915","2919","2920","2922","2924","2925","2926","2928","2930","2934","2937","2938","2940","2945","2946","2948","2950","2952","2954","2955","2958","2960","2961","2964","2967","2968","2970","2975","2976","2980","2982","2985","2988","2990","2992","2994","2996"};
        String s = in.readLine();
        while(s.isEmpty())
            s=in.readLine();
        int test = Integer.parseInt(s);
        for(int i=0;i<test;i++)
        {
            s=in.readLine();
            while(s.isEmpty())
                s=in.readLine();
            int val = Integer.parseInt(s);
            System.out.println(var[val-1]);
        }
        
        
        /*
        int arr[] = {2,3,5,7, 11, 13, 17, 19, 23, 29,31,37, 41, 43, 47, 53, 59, 61, 67, 71 
,73, 79, 83, 89, 97,101,103,107,109,113 
,127,131,137,139,149,151,157,163,167,173 
,179,181,191,193,197,199,211,223,227,229 
,233,239,241,251,257,263,269,271,277,281 
,283,293,307,311,313,317,331,337,347,349 
,353,359,367,373,379,383,389,397,401,409 
,419,421,431,433,439,443,449,457,461,463 
,467,479,487,491,499,503,509,521,523,541 
,547,557,563,569,571,577,587,593,599,601 
,607,613,617,619,631,641,643,647,653,659 
,661,673,677,683,691,701,709,719,727,733 
,739,743,751,757,761,769,773,787,797,809 
,811,821,823,827,829,839,853,857,859,863 
,877,881,883,887,907,911,919,929,937,941 
,947,953,967,971,977,983,991,997, 1009, 1013 
};
        int count=0,cnum=0;
        for(int j=1;j<3000;j++)
        {
        
            for(int i=0;i<170;i++)
        
            {
                int val=arr[i];
                
                if(j%val==0)
                {
                    count++;
                   // System.out.println("For: j="+j+"count is:"+count+"As its divisible by:"+val);
                }
                if(count==3)
                {
                    System.out.print("\""+j+"\",");
                    cnum++;
                    count=0;
                    break;
                }

            }
                    count=0;
        
        }

        System.out.println("Tot numbers:"+cnum);
    */
    }
    
}
