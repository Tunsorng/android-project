package com.example.tunsorng.retorfit.model.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public  class ArticleResonse {
    @Override
    public String toString() {
        return "ArticleResonse{" +
                "pagination=" + pagination +
                ", data=" + data +
                ", message='" + message + '\'' +
                ", code='" + code + '\'' +
                '}';
    }

    @SerializedName("PAGINATION")
    private PaginationEntity pagination;
    @SerializedName("DATA")
    private List<DataEntity> data;
    @SerializedName("MESSAGE")
    private String message;
    @SerializedName("CODE")
    private String code;

    public static class PaginationEntity {
        @Override
        public String toString() {
            return "PaginationEntity{" +
                    "totalPages=" + totalPages +
                    ", totalCount=" + totalCount +
                    ", limit=" + limit +
                    ", page=" + page +
                    '}';
        }

        @SerializedName("TOTAL_PAGES")
        private int totalPages;
        @SerializedName("TOTAL_COUNT")
        private int totalCount;
        @SerializedName("LIMIT")
        private int limit;
        @SerializedName("PAGE")
        private int page;
    }

    public static class DataEntity {
        @Override
        public String toString() {
            return "DataEntity{" +
                    "image='" + image + '\'' +
                    ", category=" + category +
                    ", status='" + status + '\'' +
                    ", author=" + author +
                    ", createdDate='" + createdDate + '\'' +
                    ", description='" + description + '\'' +
                    ", title='" + title + '\'' +
                    ", id=" + id +
                    '}';
        }

        @SerializedName("IMAGE")
        private String image;
        @SerializedName("CATEGORY")
        private CategoryEntity category;
        @SerializedName("STATUS")
        private String status;
        @SerializedName("AUTHOR")
        private AuthorEntity author;
        @SerializedName("CREATED_DATE")
        private String createdDate;
        @SerializedName("DESCRIPTION")
        private String description;
        @SerializedName("TITLE")
        private String title;
        @SerializedName("ID")
        private int id;
    }

    public static class CategoryEntity {
        @Override
        public String toString() {
            return "CategoryEntity{" +
                    "name='" + name + '\'' +
                    ", id=" + id +
                    '}';
        }

        @SerializedName("NAME")
        private String name;
        @SerializedName("ID")
        private int id;
    }

    public static class AuthorEntity {
        @Override
        public String toString() {
            return "AuthorEntity{" +
                    "imageUrl='" + imageUrl + '\'' +
                    ", facebookId='" + facebookId + '\'' +
                    ", status='" + status + '\'' +
                    ", telephone='" + telephone + '\'' +
                    ", gender='" + gender + '\'' +
                    ", email='" + email + '\'' +
                    ", name='" + name + '\'' +
                    ", id=" + id +
                    '}';
        }

        @SerializedName("IMAGE_URL")
        private String imageUrl;
        @SerializedName("FACEBOOK_ID")
        private String facebookId;
        @SerializedName("STATUS")
        private String status;
        @SerializedName("TELEPHONE")
        private String telephone;
        @SerializedName("GENDER")
        private String gender;
        @SerializedName("EMAIL")
        private String email;
        @SerializedName("NAME")
        private String name;
        @SerializedName("ID")
        private int id;
    }
}
