package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
//Todo테이블과 mapping 됨
@Table(name = "Todo") //명시하지 않으면 클래스 명이 테이블 이름이 됨
public class TodoEntity {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name="system-uuid", strategy="uuid")
    private String id; //이 오브젝트의 아이디
    private String userId; //이 오브젝트를 생성한 사용자의 아이디
    private String title; // Todo 타이틀
    private boolean done; // true = todo를 완료한 경우
}
