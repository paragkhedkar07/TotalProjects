import { Component, OnInit, Input, EventEmitter, Output } from "@angular/core";

@Component({
  selector: "app-demo",
  templateUrl: "./demo.component.html",
  styleUrls: ["./demo.component.css"]
})
export class DemoComponent implements OnInit {
  constructor() {}
  // task no. 1
  @Input() abc: string;

  // task no.2
  @Output() childevent = new EventEmitter();
  childmessage: string = "child to parent";
  ngOnInit() {}

  clickhere() {
    this.childevent.emit(this.childmessage);
  }
}
