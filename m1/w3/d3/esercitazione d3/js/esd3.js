document.querySelector('#salva')
        .addEventListener('click', function(){

            let testo = document.querySelector('#text');
            
            let div = document.createElement('div');
            div.classList.add('todo')
            
            let span = document.createElement('span');
            span.textContent = testo.value;

            let completato = document.createElement('button');
            completato.textContent = 'Completato';

            completato.addEventListener('click', ()=> {
                div.classList.add('completato');
                document.querySelector('#lista-completati')
                .append(div);
            })

            div.append(span, completato);
            document.querySelector('#lista').append(div);
        

            testo.value = '';            
        });


        let cerca = document.querySelector('#cerca');

        