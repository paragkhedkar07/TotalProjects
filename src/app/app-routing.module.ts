import { NgModule } from "@angular/core";
import { Routes, RouterModule } from "@angular/router";
import { InputComponent } from "./input/input.component";
import { DisplayComponent } from "./display/display.component";
import { ViewdetailsComponent } from "./viewdetails/viewdetails.component";

const routes: Routes = [
  { path: "", component: DisplayComponent },
  { path: "input", component: InputComponent },
  { path: "view", component: ViewdetailsComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
