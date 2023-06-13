package kyu_5.URL_shortener;

//import com.google.common.collect.HashBiMap;
//
//public class Shortener {
//    private HashBiMap<String, String> map = HashBiMap.create();
//
//    public String urlShortener(String longURL) {
//        if (map.containsKey(longURL))
//            return map.get(longURL);
//
//        String shortURL = "short.ly/";
//        for (int c = map.size(); c >= 0; c = c / 26 - 1)
//            shortURL += (char) ('a' + (c) % 26);
//
//        map.put(longURL, shortURL);
//
//        return shortURL;
//    }
//
//    public String urlRedirector(String shortURL) {
//        return map.inverse().get(shortURL);
//    }
//}