package com.leanote.android.model;

import com.leanote.android.util.StringUtils;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by binnchx on 10/18/15.
 */
public class NoteDetail implements Serializable {


    private Long id;
    private String noteId;
    private String noteBookId;
    private String userId;
    private String title;
    private String tags;
    private String content;
    private boolean isMarkDown;
    private boolean isTrash;
    private NoteFile[] noteFiles;
    private String createdTime;
    private boolean isPublicBlog;


    public NoteFile[] getNoteFiles() {
        return noteFiles;
    }

    public void setNoteFiles(NoteFile[] noteFiles) {
        this.noteFiles = noteFiles;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getPublicTime() {
        return publicTime;
    }

    public void setPublicTime(String publicTime) {
        this.publicTime = publicTime;
    }

    private String updatedTime;
    private String publicTime;
    private int usn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getNoteBookId() {
        return noteBookId;
    }

    public void setNoteBookId(String noteBookId) {
        this.noteBookId = noteBookId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isMarkDown() {
        return isMarkDown;
    }

    public void setIsMarkDown(boolean isMarkDown) {
        this.isMarkDown = isMarkDown;
    }

    public boolean isTrash() {
        return isTrash;
    }

    public void setIsTrash(boolean isTrash) {
        this.isTrash = isTrash;
    }



    public int getUsn() {
        return usn;
    }

    @Override
    public String toString() {
        return "NoteDetail{" +
                "noteId='" + noteId + '\'' +
                ", noteBookId='" + noteBookId + '\'' +
                ", userId='" + userId + '\'' +
                ", title='" + title + '\'' +
                ", tags=" + tags +
                ", content='" + content + '\'' +
                ", isMarkDown=" + isMarkDown +
                ", isTrash=" + isTrash +
                ", noteFiles=" + Arrays.toString(noteFiles) +
                ", createdTime='" + createdTime + '\'' +
                ", updatedTime='" + updatedTime + '\'' +
                ", publicTime='" + publicTime + '\'' +
                ", usn=" + usn +
                '}';
    }

    public void setUsn(int usn) {
        this.usn = usn;
    }

    public String getNoteId() {
        return noteId;
    }

    public void setNoteId(String noteId) {
        this.noteId = noteId;
    }


    public boolean isLocalDraft() {
        return true;
    }

    public boolean hasChanges(NoteDetail otherNote) {
        return otherNote == null || !StringUtils.equals(title, otherNote.title)
                || !StringUtils.equals(content, otherNote.content);
    }

    public boolean isPublicBlog() {
        return isPublicBlog;
    }

    public void setIsPublicBlog(boolean isPublicBlog) {
        this.isPublicBlog = isPublicBlog;
    }

}
