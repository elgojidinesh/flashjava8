import { Component, OnInit } from '@angular/core';
import { EmployeeService, EmployeeService } from '../employee.service';
import { Employee } from '../employee';
@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {
 
  employees: Employee[] | undefined ;


  constructor(private employeeService:EmployeeService) { }

  ngOnInit(): void {
    this.getEmployees();

       
    }
  private getEmployees(){
this.employeeService.getEmployeesList().subscribe((data: Employee[] | undefined)=>{
  this.employees=data;
})
  }
  }


