package com.palletech.coursesdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class VideoList extends AppCompatActivity {

    private String[] full_dot_net = {
            "C# program compilation/ltgDdukzQ7I/18:47",
            "C# data types/L_gFuuSp4V0/17:53",
            "C# class/l1C4FZGCab0/10:48",
            "C# class as virtual entity/HSdIq3k51bg/9:15",
            "Objects in c#/SM_QqUdMXY0/22:14",
            "Debugging in visual studio/8hXH5HxQfFU/10:41",
            "C# Arrays/CLnA6OAlNPk/24:50",
            "Declaring and Modifying data in c# arrays/O2QI3YFupxM/9:06",
            "Arrays Assignment/Zt85ireWQWw/7:49",
            "Loops/u_k75WcEpHM/5:51",
            "for-loop/isSp9xjw0LQ/23:46",
            "C# Strings/MGCZ8AHhwDA/21:02",
            "Constructors/5h8Tu68VXsI/5:08",
            "Problems When Constructor is Not Used/Yij6AUta4yI/19:41",
            "Constructors Example/Gr6qsjTIifA/21:07",
            "Inheritence/TOBLe0qoA_o/9:24",
            "Inheritence Part 2/T7G8NFXDXFE/24:07",
            "base keyword/WaAbIMz2dqg/22:08",
            "Overriding Intro/w6ldKhR4YUs/23:31",
            "overriding an override method/fdPslUmRqm0/12:52",
            "Static Variables/zvk_hS4vEOw/9:27",
            "what is the use of properties in c#/UdiU6sp68Tc/16:16",
            "c# properties/5nHmt5Zi7l8/15:03",
            "c# constants/9_fH7R6rPaU/8:57",
            "Constants Part 2/Wn20d0KBk1o/8:22",
            "Read only variables/YfYkswfGo_k/9:27",
            "Params Keyword/wZ_bBpsd10o/16:27",
            "Exceptions/wBxVpzaTXkc/17:16",
            "Exception Handling Part 2/mTF-ct2IkGU/9:25",
            "GC Terminology/eyytXkQqOV0/17:16",
            "Dead objects/YZyKaiM5kuc/8:29",
            "GC Working mechanisam/v-VTR9Xm6Vk/9:51",
            "C# Generics/-xfzPrvKFL0/10:09",
            "C# Generics and Reusability/7g9aPw1kI1o/15:32",
            "C# Delegates/k0evYKS62Tg/7:27",
            "C# Delegates example/Vjc9UHV6tTM/22:38"
    };
    private String[] csharp_freshers_demo_videos = {
            "C# program compilation/ltgDdukzQ7I/18:47",
            "C# data types/L_gFuuSp4V0/17:53",
            "C# class/l1C4FZGCab0/10:48",
            "C# class as virtual entity/HSdIq3k51bg/9:15",
            "Objects in c#/SM_QqUdMXY0/22:14",
            "Debugging in visual studio/8hXH5HxQfFU/10:41",
            "C# Arrays/CLnA6OAlNPk/24:50",
            "Declaring and Modifying data in c# arrays/O2QI3YFupxM/9:06",
            "Arrays Assignment/Zt85ireWQWw/7:49",
            "Loops/u_k75WcEpHM/5:51",
            "for-loop/isSp9xjw0LQ/23:46",
            "C# Strings/MGCZ8AHhwDA/21:02",
            "Constructors/5h8Tu68VXsI/5:08",
            "Problems When Constructor is Not Used/Yij6AUta4yI/19:41",
            "Constructors Example/Gr6qsjTIifA/21:07",
            "Inheritence/TOBLe0qoA_o/9:24",
            "Inheritence Part 2/T7G8NFXDXFE/24:07",
            "base keyword/WaAbIMz2dqg/22:08",
            "Overriding Intro/w6ldKhR4YUs/23:31",
            "overriding an override method/fdPslUmRqm0/12:52"
    };

    private String[] csharp_exp_demo_videos = {
            "C# program compilation/ltgDdukzQ7I/18:47",
            "Debugging in visual studio/8hXH5HxQfFU/10:41",
            "Inheritence/TOBLe0qoA_o/9:24",
            "Inheritence Part 2/T7G8NFXDXFE/24:07",
            "base keyword/WaAbIMz2dqg/22:08",
            "Overriding Intro/w6ldKhR4YUs/23:31",
            "overriding an override method/fdPslUmRqm0/12:52",
            "Static Variables/zvk_hS4vEOw/9:27",
            "what is the use of properties in c#/UdiU6sp68Tc/16:16",
            "c# properties/5nHmt5Zi7l8/15:03",
            "c# constants/9_fH7R6rPaU/8:57",
            "Constants Part 2/Wn20d0KBk1o/8:22",
            "Read only variables/YfYkswfGo_k/9:27",
            "Params Keyword/wZ_bBpsd10o/16:27",
            "Exceptions/wBxVpzaTXkc/17:16",
            "Exception Handling Part 2/mTF-ct2IkGU/9:25",
            "GC Terminology/eyytXkQqOV0/17:16",
            "Dead objects/YZyKaiM5kuc/8:29",
            "GC Working mechanisam/v-VTR9Xm6Vk/9:51",
            "C# Generics/-xfzPrvKFL0/10:09",
            "C# Generics and Reusability/7g9aPw1kI1o/15:32",
            "C# Delegates/k0evYKS62Tg/7:27",
            "C# Delegates example/Vjc9UHV6tTM/22:38"
    };
    private String[] sql_server_freshers_demo_videos = {
            "SQLServer Overview/Kdc84lpF4GM/16:25",
            "Normalization/7Dc7_I48ZTg/14:30",
            "Orderby clause/quuwLXzZl3g/6:59",
            "Delete drop and truncate statements/yZNyUzSMsT8/6:58",
            "Aggregate Functions/2IYykxAXaB8/13:54",
            "Group by clause/qx0j5iWajqg/20:22",
            "Joins and Inner Join with simple explanation/i0vwTFFHTU8/33:02",
            "stored procedure/jmZsXlAYe7Y/17:11",
            "User defined functions in sql/8cJFtDESxiQ/9:01",
            "Indexes/hrVpqW_Bh2o/21:09"
    };

    private String[] sql_server_exp_demo_videos = {
            "SQLServer Overview/Kdc84lpF4GM/16:25",
            "Normalization/7Dc7_I48ZTg/14:30",
            "Orderby clause/quuwLXzZl3g/6:59",
            "Delete drop and truncate statements/yZNyUzSMsT8/6:58",
            "Aggregate Functions/2IYykxAXaB8/13:54",
            "Group by clause/qx0j5iWajqg/20:22",
            "Joins and Inner Join with simple explanation/i0vwTFFHTU8/33:02",
            "stored procedure/jmZsXlAYe7Y/17:11",
            "User defined functions in sql/8cJFtDESxiQ/9:01",
            "Indexes/hrVpqW_Bh2o/21:19"
    };

    //Declarations
    ListView videosListView;
    ArrayList<Course> topicsArrayList;
    MyAdapter myAdapter;

    class MyAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            //Return size of our source
            return topicsArrayList.size();
        }

        @Override
        public Object getItem(int position) {
            //Return item at position from source
            return topicsArrayList.get(position);
        }

        @Override
        public long getItemId(int position) {
            //Return position
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            //Get data from source based on the position
            final Course c= topicsArrayList.get(position);

            //load row.mxl, load views, and fill data
            View v=getLayoutInflater().inflate(R.layout.row, null);
            TextView courseNoTextView = (TextView) v.findViewById(R.id.courseNoTextView);
            TextView topicNameTextView= (TextView) v.findViewById(R.id.topicNameTextView);
            TextView topicDurationTextView = (TextView) v.findViewById(R.id.topicDurationTextView);
            Button youTubeBtn = (Button) v.findViewById(R.id.youTubeBtn);
            courseNoTextView.setText(""+(position+1));
            topicNameTextView.setText(c.getTopic());
            topicDurationTextView.setText("Duration "+c.getDuration());

            youTubeBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(VideoList.this, YouTubePlayerActivity.class);
                    intent.putExtra("URL", c.getYouTubeUrl());
                    startActivity(intent);
                }
            });

            //return row.xml to ListView
            return v;
        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_list);

        Intent i=getIntent();
        Bundle b=i.getExtras();
        String courseName= b.getString("CourseName");
        topicsArrayList = new ArrayList<Course>();

        videosListView = (ListView) findViewById(R.id.videoListView);


        switch (courseName){
            case "Full Dot Net":
                addAllItemsToTopicsArrayList(full_dot_net);
                break;
            case "C# Freshers Demo Videos":
                addAllItemsToTopicsArrayList(csharp_freshers_demo_videos);
                break;
            case "C# Exp Demo Videos":
                addAllItemsToTopicsArrayList(csharp_exp_demo_videos);
                break;
            case "SQL Server Fresher Demo Videos":
                addAllItemsToTopicsArrayList(sql_server_freshers_demo_videos);
                break;
            case "SQL Server Exp Demo Videos":
                addAllItemsToTopicsArrayList(sql_server_exp_demo_videos);
                break;
        }

        myAdapter = new MyAdapter();
        videosListView.setAdapter(myAdapter);
        myAdapter.notifyDataSetChanged();

    }

    private void addAllItemsToTopicsArrayList(String[] topicDetails){
        for(String item: topicDetails){
            Course course = new Course();
            course.setTopic(extractTopicName(item));
            course.setDuration(extractDuration(item));
            course.setYouTubeUrl(extractYouTubeUrl(item));
            topicsArrayList.add(course);
        }
    }

    private String extractTopicName(String item){
        return item.substring(0,item.indexOf("/"));
    }

    private String extractDuration(String item){
        return item.substring(item.lastIndexOf("/")+1,item.length());
    }

    private String extractYouTubeUrl(String item){
        return item.substring(item.indexOf("/")+1,item.lastIndexOf("/"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_video_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
