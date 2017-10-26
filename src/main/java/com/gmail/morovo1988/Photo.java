package com.gmail.morovo1988;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name="Photos")
@NoArgsConstructor
@Getter
@Setter
public class Photo {
    @Id
    @GeneratedValue
    private long id;



    @Column(columnDefinition = "LONGBLOB")
    @Lob
    private byte[] body;

//    public Photo() {
//    }

    public Photo( byte[] body) {
        this.body = body;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public byte[] getBody() {
        return body;
    }

    public void setBody(byte[] body) {
        this.body = body;
    }


}
