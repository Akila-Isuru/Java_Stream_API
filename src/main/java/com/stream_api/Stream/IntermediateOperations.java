package com.stream_api.Stream;

public class IntermediateOperations {

    /**
     * Intermediate Operations
     *
     * Java වල Stream API එකේ Intermediate Operations කියන්නේ Stream එකක තියෙන
       දත්ත (data) transform කිරීමට, filter කිරීමට, හෝ modify කිරීමට
       පාවිච්චි කරන operations වලටයි.

     මෙම operations වල ප්‍රධානතම ලක්ෂණය වන්නේ ඒවා මගින් තවත්
     නව Stream එකක් return කිරීමයි. එම නිසා මේවා එකකට පසු එකක් දිගටම
     එකතු කරමින් (chain කරමින්) ලියන්න පුළුවන්.

     Intermediate Operations වල ප්‍රධාන ලක්ෂණ

     *Lazy Execution: Intermediate operation එකක් ලියූ පමණින්ම එය ක්‍රියාත්මක වන්නේ නැත.
      Stream එකේ අවසාන operation එක
     (Terminal Operation - උදා: collect(), forEach(), count()) call කරන තෙක්
     මෙම operations run වෙන්නේ නැත.

     *Stream Transformation: මුල් Stream එක වෙනස් නොකර, වෙනස්කම් සහිත අලුත් Stream එකක් සාදයි.

     * filter () : This method filters elements based on a condition
     * map() : It transforms each element into a single stream
     * flatMap() : Used to flatten multiple collections into a single stream
     * distinct() : Removes the duplicates from the stream
     * sorted () : Sorts the elements in the stream
     * peek() : Performs an action for each element(usually for debugging)
     * limit () : Limit the number of elements in the stream
     * skip() : Skips  the first N elements in the stream
     *
     */
}
