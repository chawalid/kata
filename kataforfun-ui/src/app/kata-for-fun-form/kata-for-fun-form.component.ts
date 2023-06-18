import { Component, EventEmitter, OnInit, Output, Input } from '@angular/core';
import { FormBuilder, FormGroup, FormControl, Validators } from '@angular/forms';
import { KataForFunService } from '../kata-for-fun.service';

@Component({
  selector: 'app-kata-for-fun-form',
  templateUrl: './kata-for-fun-form.component.html'
})
export class KataForFunFormComponent implements OnInit {
  @Output() submitNumberOutput: EventEmitter<number> = new EventEmitter();
  numberForm: FormGroup;

  constructor(private formBuilder: FormBuilder) {
  }

  ngOnInit(): void {
    this.numberForm = this.formBuilder.group({
      inputNumber: ['', [Validators.required, Validators.pattern(/^\d+$/)]]
    });
  }

  convertNumber(): void {
  if (this.numberForm.valid) {
    this.submitNumberOutput.emit(this.numberForm.value.inputNumber);
  }
 }
}
