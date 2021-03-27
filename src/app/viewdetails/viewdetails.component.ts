import { Component, OnInit } from '@angular/core';
import { Info } from '../model/info';
import { CustomerregistrationService } from '../shared/customerregistration.service';

@Component({
  selector: 'app-viewdetails',
  templateUrl: './viewdetails.component.html',
  styleUrls: ['./viewdetails.component.css']
})
export class ViewdetailsComponent implements OnInit {
  infor: Info[];

  constructor(private cs: CustomerregistrationService) { }

  ngOnInit() {
  this.cs.getdata().subscribe((data:Info[]) => {this.infor = data;
  console.log(data);
   });
  }


}
