import {Component, OnInit} from '@angular/core';
import {Evaluacion} from '../../models/evaluacion.model';
import {EvaluacionService} from '../../services/evaluacion.service';
import {dateTimestampProvider} from 'rxjs/internal/scheduler/dateTimestampProvider';

@Component({
  selector: 'app-evaluacion-list',
  standalone: false,
  templateUrl: './evaluacion-list.component.html',
  styleUrl: './evaluacion-list.component.css'
})
export class EvaluacionListComponent implements OnInit{

  //Variable para almacenas los datos del backend
  evaluaciones: Evaluacion[] = [];

  constructor(private evaluacionService: EvaluacionService) {
  }

  ngOnInit() {
    this.evaluacionService.getAll().subscribe(data => {
      this.evaluaciones = data;
    })
  }

}
