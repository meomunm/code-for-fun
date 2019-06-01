package com.example.codeforfun.models;

public class TodoModel {
    private long date;
    private String description;
    private boolean isChecked;
    private TodoTagModel tagModel;

    public TodoModel(long date, String description, boolean isChecked, TodoTagModel tagModel) {
        this.date = date;
        this.description = description;
        this.isChecked = isChecked;
        this.tagModel = tagModel;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    public TodoTagModel getTagModel() {
        return tagModel;
    }

    public void setTagModel(TodoTagModel tagModel) {
        this.tagModel = tagModel;
    }

    public class TodoTagModel {
        private String tag;
        private String color;

        public TodoTagModel(String tag, String color) {
            this.tag = tag;
            this.color = color;
        }

        public String getTag() {
            return tag;
        }

        public String getColor() {
            return color;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }
}
