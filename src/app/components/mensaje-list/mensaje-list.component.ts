import {Component, OnInit} from '@angular/core';
import {Mensaje} from '../../models/mensaje.model';
import {MensajeService} from '../../services/mensaje.service';

@Component({
  selector: 'app-mensaje-list',
  standalone: false,
  templateUrl: './mensaje-list.component.html',
  styleUrl: './mensaje-list.component.css'
})
export class MensajeListComponent implements OnInit{

  mensajes: Mensaje[] = [];

  constructor(private mensajeService: MensajeService) {
  }

  ngOnInit() {
    this.mensajeService.getAll().subscribe(data => {
      this.mensajes = data;
    })
  }
}
