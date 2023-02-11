package com.example.demo.domain.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.ToString;

/**
 * Music.
 */
@Entity
@Table(name = "music")
@Data
@ToString
public class Music {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "artist")
    private String artist;

    @Column(name = "song_title")
    private String songTitle;

    @Column(name = "album")
    private String album;

    @Column(name = "description")
    private String description;

    @Column(name = "genre")
    private String genre;

    @Column(name = "rate")
    private Integer rate;

    @Column(name= "publish_date")
    private Date publishDate;

}
