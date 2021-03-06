import tags.Category;
import tags.Topic;

import java.util.ArrayList;
import java.util.List;

public class AIML {
    List<Category> cats;
    List<Topic> topics;

    public AIML() {
        cats = new ArrayList<>();
        topics = new ArrayList<>();
    }

    public void addCategory(Category c) {
        cats.add(c);
    }

    public void addTopic(Topic t) {
        topics.add(t);
    }

    @Override
    public String toString() {
        StringBuilder aimlBuilder = new StringBuilder();
        aimlBuilder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        aimlBuilder.append("<aiml version=\"2.0\">");
        for (Category cat : cats) {
            aimlBuilder.append('\n');
            aimlBuilder.append(cat.toString());
            aimlBuilder.append('\n');
        }

        for (Topic topic : topics) {
            aimlBuilder.append("\n");
            aimlBuilder.append(topic.toString());
            aimlBuilder.append("\n");
        }

        aimlBuilder.append("</aiml>");

        return aimlBuilder.toString();
    }


}
