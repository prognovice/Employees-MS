import { Component, OnInit } from '@angular/core';
import {Observable, Subject} from "rxjs";
import {Employee} from "../common/employee";
import {FormControl,FormGroup,Validators} from '@angular/forms';
@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {
  employees: Observable<Employee[]>;
  employee : Employee=new Employee();
  deleteMessage=false;
  employeelist:any;
  isupdated = false;
  // @ts-ignore
  dtOptions: DataTables.Settings = {};
  dtTrigger: Subject<any>= new Subject();
  constructor() { }

  ngOnInit(): void {
  }
  employeeupdateform=new FormGroup({
    student_id:new FormControl(),
    student_name:new FormControl(),
    student_email:new FormControl(),
    student_branch:new FormControl()
  });

}
