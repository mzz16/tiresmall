create table tire_group (
	tg_id number(4) primary key,
	tg_brand varchar2(20 char) not null,
	tg_name varchar2(30 char) not null,
	tg_img varchar2(200 char) default 'noimg',
	tg_text varchar2(100 char) not null,		
	tg_dcrate number(3) default 0,		/* dc rate 할인율 */
	tg_print number(1) not null,	/* 출력 여부 */
	tg_sedan number(1) not null,	/* 승용차 추천 1(t)/0(f) */
	tg_suv number(1) not null		/* suv 추천 1(t)/0(f)		tg_recommend로 해서 0(sedan) or 1(suv)로 해도 될지도?? */
)

drop table tire_group;

create sequence tire_group_seq

select * from tire_group

create table tire_item (
	ti_id number(5) primary key,		
	ti_tg_id number(4) not null,		/* tire_group 테이블 pk 참조하는 것 */
	ti_hg number(3) not null,			/* 하중 */
	ti_speed varchar2(2 char) not null,	/* 속도계수 		하중 + 속도계수 = 마킹이 됨. */ 
	ti_width number(3) not null,		/* 단면폭 */
	ti_ratio number(2) not null,		/* 편평비 */
	ti_inch number(2) not null,			/* 인치 */
	ti_stock number(5) not null,		/* 재고량 */
	ti_pricegp number(8) not null,		/* 기표가격 */	
	ti_pricefac number(8) not null,		/* 공장가격 */
	ti_vat number(7) not null			/* 부가세 */
)

create sequence tire_item_seq;

drop table tire_item;

select * from tire_item;
