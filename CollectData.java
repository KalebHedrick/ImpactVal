import java.util.*;

import javax.lang.model.util.Elements;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class CollectData {
    private String KD_Ratio;
    private String HeadShot_Per;
    private String Curr_Rank;
    private String Peak_Rank;
    private String Username;
    private String User_Tag;
    private String[] Agents;
    private String ACS;
    private String Win_Rate;
    private String Avg_Dmg;
    private String link;
    private boolean invalid_tracker;

    public CollectData(String Username, String User_Tag) {
        invalid_tracker = false;
        this.Username = Username;
        this.User_Tag = User_Tag;
        this.link = createTrackerLink();
        System.out.println(link);
        setUserData(link);
    }

    private String createTrackerLink() {
        String name = this.Username;
        name = name.replace(" ", "%20");
        String tag = this.User_Tag;
        name += "%23" + tag;
        return "https://tracker.gg/valorant/profile/riot/" + name + "/overview";
    }

    private void setUserData(String link) {
        try {
            Document doc = Jsoup.connect(link).get();
            org.jsoup.select.Elements k = doc.getElementsByAttributeValue("class", "value");
            if (k.size() == 0) {
                System.out.println("User has not played this act");
            } else if (k.get(1).text() == null) {
                System.out.println("Invalid User Entry.");
            } else {
                this.Curr_Rank = k.get(0).text();
                this.Peak_Rank = k.get(1).text();
                this.KD_Ratio = k.get(10).text();
                this.Avg_Dmg = k.get(9).text();
                this.HeadShot_Per = k.get(11).text();
                this.Agents = new String[] { k.get(26).text(), k.get(33).text(), k.get(40).text() };
                this.ACS = k.get(19).text();
                this.Win_Rate = k.get(12).text();
            }
        } catch (IOException e) {
            System.out.println("Invalid User Entry");
            invalid_tracker = true;
        }
    }

    public void printUserData() {
        if (!invalid_tracker) {
            System.out.println("CURRENT RANK: " + this.Curr_Rank);
            System.out.println("PEAK RANK: " + this.Peak_Rank);
            System.out.println("K/D: " + this.KD_Ratio);
            System.out.println("DAMAGE PER ROUND: " + this.Avg_Dmg);
            System.out.println("HEADSHOT %: " + this.HeadShot_Per);
            System.out.println("TOP 3 AGENTS: " + this.Agents[0] + " " + this.Agents[1] + " " + this.Agents[2]);
            System.out.println("AVERAGE COMBAT SCORE: " + this.ACS);
            System.out.println("WIN RATE: " + this.Win_Rate);
        } else {
            System.out.println("Could not print because the tracker was invalid.");
        }
    }
}
