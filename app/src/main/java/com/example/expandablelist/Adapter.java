package com.example.expandablelist;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

public class Adapter extends BaseExpandableListAdapter {

    private Context context;
    private List<String> expandableListParentItem;
    private HashMap<String, List<String>> expandableListChildItem;

    public Adapter(Context context, List<String> expandableListParentItem, HashMap<String, List<String>> expandableListChildItem) {
        this.context = context;
        this.expandableListParentItem = expandableListParentItem;
        this.expandableListChildItem = expandableListChildItem;
    }

    @Override
    public int getGroupCount() {
        return expandableListParentItem.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return expandableListChildItem.get(expandableListParentItem.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return expandableListParentItem.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return expandableListChildItem.get(expandableListParentItem.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }


    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String listParent = (String) getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.parent_item, null);
        }
        TextView tvCategoryName = convertView.findViewById(R.id.textview_parentitem);
        tvCategoryName.setText(listParent);

        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        final String listChild = (String) getChild(groupPosition, childPosition);
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.child_item, null);
        }
        TextView tvItemName = convertView.findViewById(R.id.textview_childitem);
        ImageView iconImageView = convertView.findViewById(R.id.imageview_childicon); // Add this line

        tvItemName.setText(listChild);

        switch (listChild) {
            case "Home 1":
                iconImageView.setImageResource(R.drawable.approval_bt);
                break;
            case "Dashboard 1":
                iconImageView.setImageResource(R.drawable.spend_bt);
                break;
            default:
                iconImageView.setImageResource(R.drawable.dashboard_bt);
        }

        return convertView;
    }
        @Override
        public boolean hasStableIds () {
            return false;
        }

        @Override
        public boolean isChildSelectable ( int groupPosition, int childPosition){
            return true;
        }
    }


