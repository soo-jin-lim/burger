package com.example.study01.entity;

import com.example.study01.dto.MediaFormDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "mediainfo")
@Getter
@Setter
public class MediaInfo {
    /*country_id FK
    city_id FK*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eid;		    //pk
    private String etitle;      //제목
    private String elink;		//동영상 주소(url)

    @OneToMany(mappedBy = "mediainfo", cascade = CascadeType.REMOVE, orphanRemoval = true, fetch = FetchType.LAZY)
    List<MediaImg> imgs = new ArrayList<>();

    public void updateMedia(MediaFormDTO mediaFormDTO) {
        this.etitle = mediaFormDTO.getEtitle();
        this.elink =  mediaFormDTO.getElink();
    }



}
