#!/usr/local/bin/perl
use List::MoreUtils qw/ uniq /;

########################################################
############## Requires List::MoreUtils ################
########################################################


open (MYFILE, "uiowa.example.log.2011-11-14");

@users;

while (<MYFILE>) {
    if($_  =~ /(\s*\@\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3})/){
	@linePieces = split(/\[/, $_);
	@linePieces = split(/@/, $linePieces[1]);
	push(@users, $linePieces[0]);
    }
}

@users = uniq @users;

print scalar @users;

close (MYFILE);
