package kr.ac.kopo.board.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString(exclude = "board")

public class Reply extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 1씩 자동 증가
    private Long rno;

    private String text;

    private String replyer;//gdgdggd

    @ManyToOne
    private Board board; // foreign 키 설정, ToString에 추가 작업
}

