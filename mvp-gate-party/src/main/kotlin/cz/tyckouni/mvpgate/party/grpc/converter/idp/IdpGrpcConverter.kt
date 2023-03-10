package cz.tyckouni.mvpgate.party.grpc.converter.idp

import cz.tyckouni.mvpgate.party.grpc.IdpGrpc
import cz.tyckouni.mvpgate.party.grpc.converter.GrpcConverter
import cz.tyckouni.mvpgate.party.persistence.idp.Idp

/**
 * [GrpcConverter] for the Idp entities.
 */
interface IdpGrpcConverter : GrpcConverter<Idp, IdpGrpc>
