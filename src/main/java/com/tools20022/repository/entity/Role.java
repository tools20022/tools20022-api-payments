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
import com.tools20022.repository.codeset.PartyRoleCode;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.TradeParty2;
import com.tools20022.repository.msg.TransactionAgents3;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * <li>{@linkplain com.tools20022.repository.entity.Role#mmPlayer Role.mmPlayer}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Role#mmContactPersonRole
 * Role.mmContactPersonRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Role#mmPartyRole
 * Role.mmPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Role#mmCounterpartyRisk
 * Role.mmCounterpartyRisk}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Role#mmEntry Role.mmEntry}</li>
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
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.RolePlayer#mmRole
 * RolePlayer.mmRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#mmRole Entry.mmRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ContactPersonRole#mmRole
 * ContactPersonRole.mmRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CounterpartyRisk#mmParty
 * CounterpartyRisk.mmParty}</li>
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
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected List<com.tools20022.repository.entity.RolePlayer> player;
	/**
	 * Entity which plays a role in the context of the business domain in which
	 * the role is defined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RolePlayer#mmRole
	 * RolePlayer.mmRole}</li>
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
	public static final MMBusinessAssociationEnd mmPlayer = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Role.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Player";
			definition = "Entity which plays a role in the context of the business domain in which the role is defined.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.RolePlayer.mmRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RolePlayer.mmObject();
		}
	};
	protected ContactPersonRole contactPersonRole;
	/**
	 * Contact person in the context of a role played by an organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPersonRole#mmRole
	 * ContactPersonRole.mmRole}</li>
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
	public static final MMBusinessAssociationEnd mmContactPersonRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Role.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ContactPersonRole";
			definition = "Contact person in the context of a role played by an organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPersonRole.mmRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ContactPersonRole.mmObject();
		}
	};
	protected PartyRoleCode partyRole;
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
	public static final MMBusinessAttribute mmPartyRole = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Role.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies the role of the party in the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PartyRoleCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Role.class.getMethod("getPartyRole", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CounterpartyRisk counterpartyRisk;
	/**
	 * Specifies the risk which is related to the role played by a party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CounterpartyRisk#mmParty
	 * CounterpartyRisk.mmParty}</li>
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
	public static final MMBusinessAssociationEnd mmCounterpartyRisk = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Role.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyRisk";
			definition = "Specifies the risk which is related to the role played by a party.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CounterpartyRisk.mmParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CounterpartyRisk.mmObject();
		}
	};
	protected Entry entry;
	/**
	 * Entry for which a role is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Entry#mmRole
	 * Entry.mmRole}</li>
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
	public static final MMBusinessAssociationEnd mmEntry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Role.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Entry";
			definition = "Entry for which a role is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Entry.mmRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Entry.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Role";
				definition = "Role of a party in an activity.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RolePlayer.mmRole, com.tools20022.repository.entity.Entry.mmRole, com.tools20022.repository.entity.ContactPersonRole.mmRole,
						com.tools20022.repository.entity.CounterpartyRisk.mmParty);
				subType_lazy = () -> Arrays.asList(InformationPartyRole.mmObject(), AccountPartyRole.mmObject(), EmployingPartyRole.mmObject(), DocumentPartyRole.mmObject(), MandatePartyRole.mmObject(), CardPaymentPartyRole.mmObject(),
						InvestmentFundPartyRole.mmObject(), TradePartyRole.mmObject(), SystemPartyRole.mmObject(), PaymentPartyRole.mmObject(), AssetPartyRole.mmObject(), SettlementPartyRole.mmObject(),
						com.tools20022.repository.entity.ContactPersonRole.mmObject(), SecuritiesOrderPartyRole.mmObject(), SecurityCertificatePartyRole.mmObject(), InvoicePartyRole.mmObject(), TaxPartyRole.mmObject(),
						InvestigationPartyRole.mmObject(), ChargePartyRole.mmObject(), RegulatoryAuthorityRole.mmObject(), UndertakingPartyRole.mmObject(), CorporateActionPartyRole.mmObject(), TransportPartyRole.mmObject(),
						InsurancePartyRole.mmObject(), CollateralPartyRole.mmObject(), ReportingPartyRole.mmObject(), ChequePartyRole.mmObject(), CommissionPartyRole.mmObject(), GoodsPartyRole.mmObject(),
						TradeCertificatePartyRole.mmObject(), MarketInfrastructure.mmObject(), GuaranteePartyRole.mmObject(), PaymentObligationPartyRole.mmObject(), RegulatoryReportingRole.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Role.mmPlayer, com.tools20022.repository.entity.Role.mmContactPersonRole, com.tools20022.repository.entity.Role.mmPartyRole,
						com.tools20022.repository.entity.Role.mmCounterpartyRisk, com.tools20022.repository.entity.Role.mmEntry);
				derivationComponent_lazy = () -> Arrays.asList(TransactionAgents3.mmObject(), TradeParty2.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Role.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<RolePlayer> getPlayer() {
		return player;
	}

	public void setPlayer(List<com.tools20022.repository.entity.RolePlayer> player) {
		this.player = player;
	}

	public ContactPersonRole getContactPersonRole() {
		return contactPersonRole;
	}

	public void setContactPersonRole(com.tools20022.repository.entity.ContactPersonRole contactPersonRole) {
		this.contactPersonRole = contactPersonRole;
	}

	public PartyRoleCode getPartyRole() {
		return partyRole;
	}

	public void setPartyRole(PartyRoleCode partyRole) {
		this.partyRole = partyRole;
	}

	public CounterpartyRisk getCounterpartyRisk() {
		return counterpartyRisk;
	}

	public void setCounterpartyRisk(com.tools20022.repository.entity.CounterpartyRisk counterpartyRisk) {
		this.counterpartyRisk = counterpartyRisk;
	}

	public Entry getEntry() {
		return entry;
	}

	public void setEntry(com.tools20022.repository.entity.Entry entry) {
		this.entry = entry;
	}
}