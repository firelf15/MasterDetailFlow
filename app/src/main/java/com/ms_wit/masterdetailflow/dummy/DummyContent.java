package com.ms_wit.masterdetailflow.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
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

    private static final int COUNT = 7;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), "Day " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        switch (position) {
            case 1:
                builder.append("\nWe're acquainted with the wormhole phenomenon, but this... Is a remarkable piece of bio-electronic engineering by which I see much of the EM spectrum ranging from heat and infrared through radio waves, et cetera, and forgive me if I've said and listened to this a thousand times. This planet's interior heat provides an abundance of geothermal energy. We need to neutralize the homing signal.\n");
                break;
            case 2:
                builder.append("\nFor an android with no feelings, he sure managed to evoke them in others. Besides, you look good in a dress. When has justice ever been as simple as a rule book? You're going to be an interesting companion, Mr. Data. The Enterprise computer system is controlled by three primary main processor cores, cross-linked with a redundant melacortz ramistat, fourteen kiloquad interface modules. I'll alert the crew. Computer, lights up! I guess it's better to be lucky than good. Yes, absolutely, I do indeed concur, wholeheartedly! You enjoyed that.\n");
                break;
            case 3:
                builder.append("\nThe surf's always up at the beach. The mountains are pristinely powdered. And there's never been a mosquito in our jungle. If you can keep it that way, you'll never regret a career move to Risa. Sorry, no remote workers. I suggest you drop it, Mr. Data. The Enterprise computer system is controlled by three primary main processor cores, cross-linked with a redundant melacortz ramistat, fourteen kiloquad interface modules. Well, I'll say this for him - he's sure of himself.\n");
                break;
            case 4:
                builder.append("\nComputer, lights up! We finished our first sensor sweep of the neutral zone. Wouldn't that bring about chaos? I can't. As much as I care about you, my first duty is to the ship. Fate. It protects fools, little children, and ships named \"Enterprise.\" The unexpected is our normal routine. Mr. Worf, you sound like a man who's asking his friend if he can start dating his sister. Sure. You'd be surprised how far a hug goes with Geordi, or Worf. and attack the Romulans.\n");
                break;
            case 5:
                builder.append("\nIt's not what you think. Or maybe it is. I need help building more Androids. I am your worst nightmare! You're going to be an interesting companion, Mr. Data. You bet I'm agitated! I may be surrounded by insanity, but I am not insane. A lot of things can change in twelve years, Admiral. I'll alert the crew. But the probability of making a six is no greater than that of rolling a seven. What's a knock-out like you doing in a computer-generated gin joint like this?\n");
                break;
            case 6:
                builder.append("\nWhat? We're not at all alike! Well, that's certainly good to know. Maybe we better talk out here; the observation lounge has turned into a swamp. Sure. You'd be surprised how far a hug goes with Geordi, or Worf. Yes, absolutely, I do indeed concur, wholeheartedly! Travel time to the nearest starbase? Mr. Crusher, ready a collision course with the Borg ship.\n");
                break;
            default:
                builder.append("\nAs per its mandate of deep-space exploration, its personnel are frequently brought into contact with cultures and sentient species whose existences are unknown to the Federation. Starfleet officers therefore act as official representatives of the Federation in these cases. Starfleet vessels are also frequently used to ferry ambassadors on diplomatic missions.\n");
                break;
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;

        public DummyItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
