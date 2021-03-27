import { Component, OnInit } from "@angular/core";
import { Info } from "../model/info";
import { CustomerregistrationService } from "../shared/customerregistration.service";
import { Router } from "@angular/router";
import { FormControl, FormGroup, Validators } from "@angular/forms";
import { THIS_EXPR } from "@angular/compiler/src/output/output_ast";

@Component({
  selector: "app-input",
  templateUrl: "./input.component.html",
  styleUrls: ["./input.component.css"]
})
export class InputComponent implements OnInit {
  infodata: Info = {
    id: null,
    name: "",
    address: "",
    pincode: "",
    mobileno: ""
  };
  unamePattern = "^[a-zA-Z]{8,15}$";
  Info = new FormGroup({
    id: new FormControl(null),
    name: new FormControl("", [Validators.required,Validators.pattern()]),
    address: new FormControl("", Validators.required),
    pincode: new FormControl("", [
      Validators.required
    ]),
    mobileno: new FormControl("", [
      Validators.required
    ])
  });
  constructor(private cs: CustomerregistrationService, private route: Router) {}

  ngOnInit() {}
  // submit(data); {
  //     console.log('submit call');
  //     console.log(data);
  //     this.cs.savedata(data);
  //     this.route.navigate(['view']);
  //   }

  onsubmit() {
    console.log(this.Info.controls.name.value);
    // this.infodata = this.Info.controls.value;
    // this.cs.savedata();
    this.infodata = this.Info.value;
    console.log(this.Info.value);
    console.log("saved to dummy object" + this.infodata);

    this.cs.savedata(this.infodata);
    this.route.navigate(['view']);
  }
}
