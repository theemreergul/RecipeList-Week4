package com.example.recipelist_week4.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 25;

    static {
        addItem(new DummyItem("1","Mini Caramel Rolls","Here's the perfect warm treat for pajama-clad family mornings. These ooey-gooey baked rolls come together in moments—thanks to a tube of refrigerated crescent rolls—and disappear just as quickly."));
        addItem(new DummyItem("2","Three-Bean Baked Beans","I got this recipe from an aunt and made a couple of changes to suit our tastes. With ground beef and bacon mixed in, these satisfying beans are a big hit at backyard barbecues and church picnics. I'm always asked to bring my special beans."));
        addItem(new DummyItem("3","Pepper Poppers","These creamy stuffed jalapenos have some bite. They may be the most popular treats I make! My husband is always hinting that I should make a batch."));
        addItem(new DummyItem("4","Sour Cream Chip Muffins","Take one bite and you'll see why I think these rich, tender muffins are the best I've ever tasted. Mint chocolate chips make them a big hit with my family and friends. "));
        addItem(new DummyItem("5","Onion Beef au Jus","Garlic, onions, soy sauce and onion soup mix flavor the tender beef in these savory hot sandwiches served with a tasty, rich broth for dipping. The seasoned beef makes delicious cold sandwiches, too."));
        addItem(new DummyItem("6","Tasty-Italian Vegetable Soup","Here's a dish that will warm you up fast. It takes just 25 minutes until you can sit down and start sipping on this soup."));
        addItem(new DummyItem("7","Apple Dumpling Bake","I received this recipe for baked apple dumplings with Mountain Dew from a friend of mine, then tweaked it to suit my family's tastes. The soda is definitely the secret ingredient in this rich apple dessert."));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }



    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String rpName;
        public final String rpDetail;

        public DummyItem(String id, String name, String details) {
            this.id = id;
            this.rpName = name;
            this.rpDetail = details;
        }

    }
}