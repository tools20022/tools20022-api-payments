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

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.ReservationTypeCode;
import com.tools20022.repository.entity.Limit;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Liquidity set aside by the payer for specific purposes.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Reservation" src="doc-files/Reservation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Limit Limit}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Reservation#mmReservationType
 * Reservation.mmReservationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Reservation#mmRelatedIntraPositionTransfer
 * Reservation.mmRelatedIntraPositionTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Reservation#mmSettlementInstruction
 * Reservation.mmSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Reservation#mmAccountService
 * Reservation.mmAccountService}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountService#mmReservation
 * AccountService.mmReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmReservation
 * CashSettlement.mmReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IntraPositionTransfer#mmReservation
 * IntraPositionTransfer.mmReservation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected ReservationTypeCode reservationType;
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
	public static final MMBusinessAttribute mmReservationType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Reservation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReservationType";
			definition = "Nature of the reservation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ReservationTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Reservation.class.getMethod("getReservationType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.IntraPositionTransfer> relatedIntraPositionTransfer;
	/**
	 * Transfer process for which reservation information is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.IntraPositionTransfer#mmReservation
	 * IntraPositionTransfer.mmReservation}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedIntraPositionTransfer = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Reservation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedIntraPositionTransfer";
			definition = "Transfer process for which reservation information is provided.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.IntraPositionTransfer.mmReservation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.IntraPositionTransfer.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CashSettlement> settlementInstruction;
	/**
	 * Specifies the instruction which originated the reservation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmReservation
	 * CashSettlement.mmReservation}</li>
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
	public static final MMBusinessAssociationEnd mmSettlementInstruction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Reservation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementInstruction";
			definition = "Specifies the instruction which originated the reservation.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashSettlement.mmReservation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashSettlement.mmObject();
		}
	};
	protected AccountService accountService;
	/**
	 * Account services for which reservation information is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountService#mmReservation
	 * AccountService.mmReservation}</li>
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
	public static final MMBusinessAssociationEnd mmAccountService = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Reservation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountService";
			definition = "Account services for which reservation information is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountService.mmReservation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AccountService.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Reservation";
				definition = "Liquidity set aside by the payer for specific purposes.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AccountService.mmReservation, com.tools20022.repository.entity.CashSettlement.mmReservation,
						com.tools20022.repository.entity.IntraPositionTransfer.mmReservation);
				superType_lazy = () -> Limit.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Reservation.mmReservationType, com.tools20022.repository.entity.Reservation.mmRelatedIntraPositionTransfer,
						com.tools20022.repository.entity.Reservation.mmSettlementInstruction, com.tools20022.repository.entity.Reservation.mmAccountService);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Reservation.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ReservationTypeCode getReservationType() {
		return reservationType;
	}

	public void setReservationType(ReservationTypeCode reservationType) {
		this.reservationType = reservationType;
	}

	public List<IntraPositionTransfer> getRelatedIntraPositionTransfer() {
		return relatedIntraPositionTransfer;
	}

	public void setRelatedIntraPositionTransfer(List<com.tools20022.repository.entity.IntraPositionTransfer> relatedIntraPositionTransfer) {
		this.relatedIntraPositionTransfer = relatedIntraPositionTransfer;
	}

	public List<CashSettlement> getSettlementInstruction() {
		return settlementInstruction;
	}

	public void setSettlementInstruction(List<com.tools20022.repository.entity.CashSettlement> settlementInstruction) {
		this.settlementInstruction = settlementInstruction;
	}

	public AccountService getAccountService() {
		return accountService;
	}

	public void setAccountService(com.tools20022.repository.entity.AccountService accountService) {
		this.accountService = accountService;
	}
}