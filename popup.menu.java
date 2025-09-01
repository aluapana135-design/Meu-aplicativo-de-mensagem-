ImageButton menuOpcoes = findViewById(R.id.menu_opcoes);
menuOpcoes.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        PopupMenu popupMenu = new PopupMenu(MainActivity.this, v);
        popupMenu.getMenuInflater().inflate(R.menu.menu_opcoes, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                // Tratar o clique no item do menu
                return true;
            }
        });
        popupMenu.show();
    }
});