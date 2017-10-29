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
import com.tools20022.repository.codeset.PartyRoleCode;
import com.tools20022.repository.msg.TradeParty2;
import com.tools20022.repository.msg.TransactionAgents3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Role of a party in an activity.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Role" src="doc-files/Role.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Role#Player Role.Player}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Role#ContactPersonRole
 * Role.ContactPersonRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Role#PartyRole
 * Role.PartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Role#CounterpartyRisk
 * Role.CounterpartyRisk}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Role#Entry Role.Entry}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.RolePlayer#Role
 * RolePlayer.Role}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#Role Entry.Role}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ContactPersonRole#Role
 * ContactPersonRole.Role}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CounterpartyRisk#Party
 * CounterpartyRisk.Party}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.InformationPartyRole
 * InformationPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountPartyRole
 * AccountPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.EmployingPartyRole
 * EmployingPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DocumentPartyRole
 * DocumentPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MandatePartyRole
 * MandatePartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CardPaymentPartyRole
 * CardPaymentPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentFundPartyRole
 * InvestmentFundPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradePartyRole
 * TradePartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SystemPartyRole
 * SystemPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentPartyRole
 * PaymentPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetPartyRole
 * AssetPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SettlementPartyRole
 * SettlementPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ContactPersonRole
 * ContactPersonRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrderPartyRole
 * SecuritiesOrderPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecurityCertificatePartyRole
 * SecurityCertificatePartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvoicePartyRole
 * InvoicePartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxPartyRole TaxPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestigationPartyRole
 * InvestigationPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ChargePartyRole
 * ChargePartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RegulatoryAuthorityRole
 * RegulatoryAuthorityRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.UndertakingPartyRole
 * UndertakingPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CorporateActionPartyRole
 * CorporateActionPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TransportPartyRole
 * TransportPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InsurancePartyRole
 * InsurancePartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CollateralPartyRole
 * CollateralPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ReportingPartyRole
 * ReportingPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ChequePartyRole
 * ChequePartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CommissionPartyRole
 * CommissionPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.GoodsPartyRole
 * GoodsPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradeCertificatePartyRole
 * TradeCertificatePartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MarketInfrastructure
 * MarketInfrastructure}</li>
 * <li>{@linkplain com.tools20022.repository.entity.GuaranteePartyRole
 * GuaranteePartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentObligationPartyRole
 * PaymentObligationPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RegulatoryReportingRole
 * RegulatoryReportingRole}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionAgents3
 * TransactionAgents3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeParty2 TradeParty2}</li>
 * </ul>
 * </li>
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
 * "Role"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Role of a party in an activity."</li>
 * </ul>
 */
public class Role {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Entity which plays a role in the context of the business domain in which
	 * the role is defined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.RolePlayer#Role
	 * RolePlayer.Role}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RolePlayer
	 * RolePlayer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Role Role}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Player"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity which plays a role in the context of the business domain in which the role is defined."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Player = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Role.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Player";
			definition = "Entity which plays a role in the context of the business domain in which the role is defined.";
			minOccurs = 0;
			type_lazy = () -> RolePlayer.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RolePlayer.Role;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Contact person in the context of a role played by an organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPersonRole#Role
	 * ContactPersonRole.Role}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ContactPersonRole
	 * ContactPersonRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Role Role}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactPersonRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contact person in the context of a role played by an organisation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ContactPersonRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Role.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ContactPersonRole";
			definition = "Contact person in the context of a role played by an organisation.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.ContactPersonRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPersonRole.Role;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the role of the party in the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode
	 * PartyRoleCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Role Role}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the role of the party in the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PartyRole = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Role.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies the role of the party in the transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PartyRoleCode.mmObject();
		}
	};
	/**
	 * Specifies the risk which is related to the role played by a party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CounterpartyRisk#Party
	 * CounterpartyRisk.Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CounterpartyRisk
	 * CounterpartyRisk}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Role Role}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyRisk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the risk which is related to the role played by a party."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CounterpartyRisk = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Role.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyRisk";
			definition = "Specifies the risk which is related to the role played by a party.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CounterpartyRisk.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CounterpartyRisk.Party;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Entry for which a role is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Entry#Role
	 * Entry.Role}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Entry Entry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Role Role}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Entry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entry for which a role is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Entry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Role.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Entry";
			definition = "Entry for which a role is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Entry.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Entry.Role;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Role";
				definition = "Role of a party in an activity.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RolePlayer.Role, com.tools20022.repository.entity.Entry.Role, com.tools20022.repository.entity.ContactPersonRole.Role,
						com.tools20022.repository.entity.CounterpartyRisk.Party);
				subType_lazy = () -> Arrays.asList(InformationPartyRole.mmObject(), AccountPartyRole.mmObject(), EmployingPartyRole.mmObject(), DocumentPartyRole.mmObject(), MandatePartyRole.mmObject(), CardPaymentPartyRole.mmObject(),
						InvestmentFundPartyRole.mmObject(), TradePartyRole.mmObject(), SystemPartyRole.mmObject(), PaymentPartyRole.mmObject(), AssetPartyRole.mmObject(), SettlementPartyRole.mmObject(),
						com.tools20022.repository.entity.ContactPersonRole.mmObject(), SecuritiesOrderPartyRole.mmObject(), SecurityCertificatePartyRole.mmObject(), InvoicePartyRole.mmObject(), TaxPartyRole.mmObject(),
						InvestigationPartyRole.mmObject(), ChargePartyRole.mmObject(), RegulatoryAuthorityRole.mmObject(), UndertakingPartyRole.mmObject(), CorporateActionPartyRole.mmObject(), TransportPartyRole.mmObject(),
						InsurancePartyRole.mmObject(), CollateralPartyRole.mmObject(), ReportingPartyRole.mmObject(), ChequePartyRole.mmObject(), CommissionPartyRole.mmObject(), GoodsPartyRole.mmObject(),
						TradeCertificatePartyRole.mmObject(), MarketInfrastructure.mmObject(), GuaranteePartyRole.mmObject(), PaymentObligationPartyRole.mmObject(), RegulatoryReportingRole.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Role.Player, com.tools20022.repository.entity.Role.ContactPersonRole, com.tools20022.repository.entity.Role.PartyRole,
						com.tools20022.repository.entity.Role.CounterpartyRisk, com.tools20022.repository.entity.Role.Entry);
				derivationComponent_lazy = () -> Arrays.asList(TransactionAgents3.mmObject(), TradeParty2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}