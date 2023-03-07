alter table notice rename column n_data to n_date;

insert into notice values(notice_seq.nextval, '매장', '고마워 재현아', 'ㅋㅋ', sysdate);

select * from notice;


select * from notice where n_title like '%고%' and n_sortation like '%%';

create table auth(
    a_id varchar2(30char) primary key,
    a_pw varchar2(20char) not null,
    a_name varchar2(15char) not null,
    a_phone varchar2(13char) not null,
    a_address varchar2(100char) not null,
    a_date date not null
)

select * from auth;

insert into auth values('wm', '123', '박영웅', '010-8968-9002', '서울 종로구 종각 솔데스크 802호', sysdate);
insert into auth values('wm2', '123', '박영웅2', '010-8968-9002', '서울 종로구 종각 솔데스크 802호', sysdate);
insert into auth values('wm3', '123', '박영웅3', '010-8968-9002', '서울 종로구 종각 솔데스크 802호', sysdate);

create table notice(
    n_no number(5) primary key,
    n_sortation varchar2(20 char) not null,
    n_title varchar2(100 char) not null,
    n_txt varchar2(2000 char) not null,
    n_date date not null
)

select * from notice;
drop taBLE NOTICE;

delete from faq;
drop table faq;

create table faq(
    f_no number(5) primary key,
    f_sortation varchar2(20 char) not null,
    f_title varchar2(100 char) not null,
    f_txt varchar2(2000 char) not null,
    f_date date not null
)

create sequence faq_seq;

insert into faq values(faq_seq.nextval, '회원', '테스트용 인서트', '테스트용 안쪽 txt 내용물입니다', sysdate)

select * from faq;

drop table qna cascade constraint purge

create table qna(
    q_no number(5) primary key,
    q_title varchar2(100 char) not null,
    q_txt varchar2(2000 char) not null,
    q_date date not null,
    q_id varchar2(30char) not null,
    q_reply_has number(1) default 0 not null,
    constraint a_q_id
    foreign key(q_id)
    references auth (a_id)
    on delete cascade
);
create sequence qna_seq;
insert into qna values(qna_seq.nextval, 'qna 1대1 문의 테스트 제목', 'qna 내용 테스트', sysdate, 'wm', default);
insert into qna values(qna_seq.nextval, 'qna 1대1 문의 테스트 제목22', 'qna 내용 테스트11', sysdate, 'wm2',default);
insert into qna values(qna_seq.nextval, 'qna 1대1 문의 테스트 제목33', 'qna 내용 테스트22', sysdate, 'wm2',default);
insert into qna values(qna_seq.nextval, 'qna 1대1 문의 테스트 제목44', 'qna 내용 테스트33', sysdate, 'wm3',default);
insert into qna values(qna_seq.nextval, 'qna 1대1 문의 테스트 제목55', 'qna 내용 테스트44', sysdate, 'wm3',default);

select q_no, q_title, q_txt, q_date, q_id, q_reply_has, a_id, a_name
from qna, auth where q_id = a_id order by q_no
delete qna;
select *from qna;
create table qna_reply(
    q_reply_no number(5) primary key,
    q_reply_txt varchar2(2000char) not null,
    q_reply_date date not null,
    q_reply_board_no number(5) not null,
    constraint reply_q_id
    foreign key(q_reply_board_no)
    references qna (q_no)
    on delete cascade
);
drop table qna_reply cascade constraint purge;
select q.*, a.a_id, a.a_name, qr.q_reply_board_no
from qna q, auth a, qna_reply qr where q.q_id = a.a_id and q.q_no = qr.q_reply_board_no order by q_no

insert into qna_reply values(qna_reply_seq.nextval,'굿',sysdate,62);
create sequence qna_reply_seq;
select * from qna_reply;
delete qna_reply;


			select q.*, a.a_id, a.a_name
			from qna q, auth a where q.q_id = a.a_id and
            a_name = '' and
            a_id = '' and
            q_title like '%'||?||'%'
            order by q_no;
delete qna_reply;
            
select q.*, a.a_id, a.a_name
			from qna q, auth a 
            where q.q_id = a.a_id and
            a_name = '박영웅2' and
            a_id = 'wm2' and
            q_title like '%%'
            order by q_no;            
    
        
select q_no, q_title, q_txt, q_date, q_id, q_reply_has, a_id, a_name
from qna, auth where q_id = a_id order by q_no        

select count(*)
		from notice
		where n_title like  '%테%'
        
select * from 
(select rownum as rn, n_no, n_sortation, n_title, n_txt, n_date from(
select * from notice where n_title like '%%' and n_sortation = '매장' order by n_no desc)
)where rn >= 2 and rn <=3;

select count(*)
		from faq
		where f_title like  '%테%'
        
       
        
        select count(*)
		from qna, auth
		where q_id = a_id
        and q_title like '%%'
        and q_id like '%%'
        and a_name like '%%'
        
        
        
        select *
		from qna, auth
		where
        q_id = a_id and
        q_title like '%%'
        and q_id like '%%'
        and a_name like '%%'
        
        select * from qna;
        select * from auth;
        
        select * from
        (select rownum as rn, q_no, q_title, q_txt, q_date,q_reply_has, a_id, a_name
        from(select * from qna q, auth a where q.q_id = a.a_id
        and q.q_title like '%대%' and a.a_id = 'wm2' and a.a_name = '박영웅2' order by q_no))
        where rn >= 1 and rn <= 2;
--------------------------(order table)-------------------------       
create table product_order (
    o_no number(10) primary key,                -- pk
    o_sortation varchar2(10 char) not null,     -- 회원 / 비회원으로 처리
    o_ordernumber varchar2(30 char) not null,   -- 주문 번호 결제일시date + UUID로 처리
    o_orderdate date not null,                  -- 주문 일시
    o_ordername varchar2(20 char) not null,     -- ex)(2본 / 4본) // (2ea / 4ea)
    o_product varchar2(100 char) not null,      -- ex) (2본 ! A 타이어 2, 2본 ! B 타이어) 갯수랑 타이어 여러개 구매할때 split으로 자바에서 처리 (장바구니)
    o_price number(10) not null,                -- 총 가격
    o_paymethod varchar2(10 char) not null,     -- 지불 방법 무통장/ 현장결제
    o_deliverymethod varchar2(10 char),         -- 추후 삭제하던지 있던지
    o_step varchar2(10 char) not null,          -- 결제완료/ 결제대기/결제취소/배송준비중/배송중/배송완료 radio로 처리
    o_storeshop varchar2(100 char) not null,    -- 장착점 ( 관리자 페이지에선 배송지로 처리)
    o_tireinstalldate date not null,            -- 장착예정일
    o_name varchar2(20 char) not null,          -- 구매자 이름
    o_phone varchar2(15 char) not null,         -- 구매자 전화번호
    o_email varchar2(30 char),                  -- 구매자 이메일
    o_caryear varchar2(5 char),                 -- 연식
    o_carbrand varchar2(15 char),               -- 브랜드
    o_carname varchar2(30 char),                -- 자동차 이름 ( 위 3가지는 null 가능 없을시 request 에서 기술해달라고 요청)
    o_carnumber varchar2(10 char) not null,     -- 자동차 번호판 (필수)
    o_request varchar2(1000 char)               -- 차종을 선택할 수 없는 경우 이곳에 차량정보를 적어주세요!
);

drop table product_order;


insert into product_order values(o_no_seq.nextval, '회원', sysdate, '20230307120000ED484C',     
    create sequence o_no_seq;
----------(tire)-----------------------    
create table tire(
    t_no number(10) primary key,
    t_hg varchar2(100 char) not null,
    t_speed varchar2(50 char) not null,
    t_code varchar2(50 char),
    t_brand varchar2(30 char) not null,
    t_name varchar2(50 char) not null,
    t_img varchar2(1000 char),
    t_size varchar2(500 char) not null,
    t_stock number(5) not null
)

create sequence t_no_seq;        