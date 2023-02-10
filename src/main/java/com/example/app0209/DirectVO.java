package com.example.app0209;

public class DirectVO {
    // VO(DTO) 구성요소
    // 1. 필드 - 저장하고 싶은 변수들
    // 2. 생성자 - 필드 초기화 용도
    // 3. get(확인용), set(수정용)
    // 4. toString() - 객체에 저장된 모든 필드들을 문자열로 리턴~

    private String title;
    private String address;

    public DirectVO(String title, String address){
        this.title = title;
        this.address = address;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("DirectVO{");
        sb.append("title='").append(title).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append('}');
        return sb.toString();
        // 결론! String을 + 연산 할 때는 (+) 보다 Buffer 쓰는게 메모리 소모도 적고 더 빠르다!
    }
}
