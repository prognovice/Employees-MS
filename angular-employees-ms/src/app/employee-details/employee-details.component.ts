import { Component, OnInit } from '@angular/core';
import {Employee} from "../common/employee";


import {Observable} from "rxjs";
@Component({
  selector: 'app-employee-details',
  templateUrl: './employee-details.component.html',
  styleUrls: ['./employee-details.component.css']
})
export class EmployeeDetailsComponent implements OnInit {
  employees: Observable<Employee[]>;


  constructor() { }

  ngOnInit(): void {
  }

}
