import { Component, OnInit } from "@angular/core";
import { Router } from "@angular/router";

@Component({
  selector: "app-display",
  templateUrl: "./display.component.html",
  styleUrls: ["./display.component.css"]
})
export class DisplayComponent implements OnInit {
  constructor(private route: Router) {}

  ngOnInit() {}
  personalloan() {
    this.route.navigate(["input"]);
  }
  goldloan() {
    this.route.navigate(["input"]);
  }
  businessloan() {
    this.route.navigate(["input"]);
  }
}
