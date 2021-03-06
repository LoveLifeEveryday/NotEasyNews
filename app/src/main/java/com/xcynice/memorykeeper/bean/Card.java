package com.xcynice.memorykeeper.bean;

/**
 * @Description:
 * @Author: Yu ki-r
 * @CreateDate: 2020/11/30 22:23
 */
public class Card {


    /**
     * cardId : 1
     * cardBagId : 1
     * question : 测试问题
     * answer : 测试答案
     * more : 测试解释
     */

    private String cardBagId;
    private String question;
    private String answer;
    private String more;


    public String getCardBagId() {
        return cardBagId;
    }

    public void setCardBagId(String cardBagId) {
        this.cardBagId = cardBagId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getMore() {
        return more;
    }

    public void setMore(String more) {
        this.more = more;
    }
}

