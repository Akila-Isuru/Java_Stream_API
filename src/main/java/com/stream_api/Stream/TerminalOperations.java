package com.stream_api.Stream;

public class TerminalOperations {
    /**
     * Java වල Stream API එකේ Terminal Operations කියන්නේ Stream pipeline එකක
       අවසානයටම යොදන operations වලටයි.

     *Terminal operation එකක් Call කල සැනින් Stream එකේ සියලුම Intermediate
      operations run වී අවසන් ප්‍රතිඵලය (Result එක) ලබා දෙයි.
      Terminal operation එකක් යෙදූ පසු එම Stream එක නැවත
      භාවිත කිරීමට (reuse කිරීමට) නොහැක.

     *Terminal Operations වල ප්‍රධාන ලක්ෂණ

     *Triggers Execution: Intermediate operations
      (උදා: filter, map) ලියා තිබුණද, Stream එක ක්‍රියාත්මක වන්නේ
      Terminal operation එකක් call කළ විට පමණි (Lazy evaluation අවසන් වේ).

     *Produces a Result: මෙයින් ලැබෙන්නේ අලුත් Stream එකක් නෙවෙයි.
      එකතු කරන ලද අගයක් (Primitive value), Collection එකක් (List, Set),
      Optional අගයක්, නැතහොත් void (ප්‍රතිඵලයක් නැති) අගයකි.

     collect() : Collects the elements of the stream into a collection
     forEach() : Performs an action for each element in the stream
     reduce() : Reduces the elements of the stream to a single value
     count() : Counts the number of the elements
     anyMatch() : Checks if any elements match a condition
     allMatch() : Checks if all elements match a condition
     noneMatch() : Checks if none of the elements match a condition
     findFirst() : Returns the first element in the stream
     findAny() : Returns any element from the stream (Mainly use in parallel stream)


     */
}
