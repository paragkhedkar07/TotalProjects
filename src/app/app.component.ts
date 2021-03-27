import { Component } from "@angular/core";

@Component({
  selector: "app-root",
  templateUrl: "./app.component.html",
  styleUrls: ["./app.component.css"]
})
export class AppComponent {
  title = "material-demo";
  msg: string = "parent to child";
  childmsg:string;
  login(event) {
    console.log(event);
    this.childmsg=event;
  }
}
