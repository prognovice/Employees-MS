create schema if not exists `emp-manage-dev` collate utf8mb4_0900_ai_ci;

create table if not exists tbl_companies
(
	company_id bigint auto_increment
		primary key,
	company_name varchar(40) null
);

create table if not exists tbl_departments
(
	department_id bigint auto_increment
		primary key,
	department_name varchar(40) null
);

create table if not exists tbl_jobs
(
	job_id bigint auto_increment
		primary key,
	job_title varchar(40) null
);

create table if not exists tbl_employees
(
	employee_id bigint auto_increment
		primary key,
	first_name varchar(20) null,
	last_name varchar(20) null,
	email_id varchar(25) null,
	phone_number varchar(25) null,
	hire_date date null,
	salary decimal(8,2) null,
	job_id bigint null,
	department_id bigint null,
	company_id bigint null,
	gender varchar(10) not null,
	marital_status varchar(10) not null,
	nationality varchar(10) not null,
	photo blob null,
	driving_license varchar(255) not null,
	military_status varchar(10) not null,
	constraint tbl_employees_ibfk_1
		foreign key (department_id) references tbl_departments (department_id),
	constraint tbl_employees_ibfk_2
		foreign key (job_id) references tbl_jobs (job_id),
	constraint tbl_employees_ibfk_3
		foreign key (company_id) references tbl_companies (company_id)
);

create index department_id
	on tbl_employees (department_id);

create index job_id
	on tbl_employees (job_id);

create index working_at
	on tbl_employees (company_id);

create table if not exists tbl_users
(
	user_id bigint auto_increment
		primary key,
	user_name varchar(40) not null,
	user_pass varchar(255) null,
	new_column int null,
	employee_id bigint null,
	constraint tbl_users_user_name_uindex
		unique (user_name),
	constraint tbl_users_ibfk_1
		foreign key (employee_id) references tbl_employees (employee_id)
);

create table if not exists tbl_roles
(
	role_id bigint auto_increment
		primary key,
	user_name varchar(128) not null,
	role varchar(128) not null,
	constraint tbl_roles_pk
		unique (user_name, role),
	constraint tbl_roles_tbl_users_user_name_fk
		foreign key (user_name) references tbl_users (user_name)
			on delete cascade
);

create index employee_id
	on tbl_users (employee_id);

