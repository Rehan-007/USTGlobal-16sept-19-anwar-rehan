import { Component, OnInit, DoCheck, AfterViewInit, AfterViewChecked, OnDestroy } from '@angular/core';
import { NgForm } from '@angular/forms';
import { UserService } from 'src/app/user.service';

@Component({
  selector: 'app-form-a',
  templateUrl: './form-a.component.html',
  styleUrls: ['./form-a.component.css']
})
export class FormAComponent implements OnInit  , DoCheck , AfterViewInit , AfterViewChecked , OnDestroy{
   Users;
   selectedUser;
   today = new Date();
  constructor(public service: UserService ) {
    this.getData();
  }

  ngOnInit() {
    console.log('ngOninit is executed');
  }
  ngDoCheck() {
    console.log('ng do check is executed');
  }
  ngAfterViewInit() {
    console.log('afterViewinIt is executed');
  }
  ngAfterViewChecked() {
    console.log('ng after ViewChechked function is executed');
  }
  ngOnDestroy() {
    console.log('Ondestrroy  function executed');
  }
  addData(form: NgForm) {
      console.log(form.value);
      this.service.postUser(form.value).subscribe(data => {
        console.log(data);
      }, err => {
        console.log(err);
      }, () => {
        console.log('data posted successfully');
      });
  }
  getData() {
    this.service.getUsers().subscribe(data => {
      console.log(data);
      this.Users = data;
    }, err => {
      console.log(err);
    }, () => {
      console.log('data got successfully');
    });
  }
  deleteData(user) {
    console.log(user);
    this.service.deleteUser(user.id).subscribe(data => {
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('data deleted successfully');
    } );
  }
  selectUser(user) {
    console.log(user);
    this.selectedUser = user;
  }
  updateData(form){
    console.log(form.value);
    this.service.updateUser(form.value.id , form.value).subscribe(data =>{
      console.log(data);
    }, err => {
       console.log(err);
    }, () => {
      console.log('data upadted successfully');
    } );
  }

}
