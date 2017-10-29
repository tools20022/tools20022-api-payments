/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.ReservationTypeCode;
import com.tools20022.repository.entity.Limit;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Liquidity set aside by the payer for specific purposes.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Reservation" src="doc-files/Reservation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Reservation#ReservationType
 * Reservation.ReservationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Reservation#RelatedIntraPositionTransfer
 * Reservation.RelatedIntraPositionTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Reservation#SettlementInstruction
 * Reservation.SettlementInstruction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Reservation#AccountService
 * Reservation.AccountService}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.AccountService#Reservation
 * AccountService.Reservation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashSettlement#Reservation
 * CashSettlement.Reservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IntraPositionTransfer#Reservation
 * IntraPositionTransfer.Reservation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Limit Limit}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Reservation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Liquidity set aside by the payer for specific purposes."</li>
 * </ul>
 */
public class Reservation extends Limit {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Nature of the reservation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ReservationTypeCode
	 * ReservationTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Reservation Reservation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReservationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Nature of the reservation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ReservationType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Reservation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReservationType";
			definition = "Nature of the reservation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ReservationTypeCode.mmObject();
		}
	};
	/**
	 * Transfer process for which reservation information is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.IntraPositionTransfer#Reservation
	 * IntraPositionTransfer.Reservation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.IntraPositionTransfer
	 * IntraPositionTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Reservation Reservation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedIntraPositionTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transfer process for which reservation information is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedIntraPositionTransfer = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Reservation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedIntraPositionTransfer";
			definition = "Transfer process for which reservation information is provided.";
			minOccurs = 0;
			type_lazy = () -> IntraPositionTransfer.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.IntraPositionTransfer.Reservation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the instruction which originated the reservation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#Reservation
	 * CashSettlement.Reservation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Reservation Reservation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the instruction which originated the reservation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SettlementInstruction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Reservation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementInstruction";
			definition = "Specifies the instruction which originated the reservation.";
			minOccurs = 0;
			type_lazy = () -> CashSettlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashSettlement.Reservation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Account services for which reservation information is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountService#Reservation
	 * AccountService.Reservation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AccountService
	 * AccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Reservation Reservation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account services for which reservation information is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AccountService = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Reservation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountService";
			definition = "Account services for which reservation information is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.AccountService.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AccountService.Reservation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Reservation";
				definition = "Liquidity set aside by the payer for specific purposes.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AccountService.Reservation, com.tools20022.repository.entity.CashSettlement.Reservation,
						com.tools20022.repository.entity.IntraPositionTransfer.Reservation);
				superType_lazy = () -> Limit.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Reservation.ReservationType, com.tools20022.repository.entity.Reservation.RelatedIntraPositionTransfer,
						com.tools20022.repository.entity.Reservation.SettlementInstruction, com.tools20022.repository.entity.Reservation.AccountService);
			}
		});
		return mmObject_lazy.get();
	}
}