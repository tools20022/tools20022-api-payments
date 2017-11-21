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
import com.tools20022.repository.codeset.LegalStructureCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Organised structure that is set up for a particular purpose. For example, a
 * business, government body, department, charity, or financial institution.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Organisation" src="doc-files/Organisation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Organisation#mmPurpose
 * Organisation.mmPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#mmRegistrationDate
 * Organisation.mmRegistrationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
 * Organisation.mmOrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#mmParentOrganisation
 * Organisation.mmParentOrganisation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Organisation#mmBranch
 * Organisation.mmBranch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#mmSecuritiesModification
 * Organisation.mmSecuritiesModification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#mmPlaceOfOperation
 * Organisation.mmPlaceOfOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#mmPlaceOfRegistration
 * Organisation.mmPlaceOfRegistration}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Organisation#mmDescription
 * Organisation.mmDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#mmLegalStructure
 * Organisation.mmLegalStructure}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Organisation#mmSector
 * Organisation.mmSector}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#mmRelatedIndicationOfInterest
 * Organisation.mmRelatedIndicationOfInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Organisation#mmStrategy
 * Organisation.mmStrategy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationHierarchy
 * Organisation.mmOrganisationHierarchy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#mmRepresentativeOfficer
 * Organisation.mmRepresentativeOfficer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#mmEstablishmentDate
 * Organisation.mmEstablishmentDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
 * BranchAndFinancialInstitutionIdentification5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation12 Organisation12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation14 Organisation14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrganisationModification1
 * OrganisationModification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LegalOrganisation2
 * LegalOrganisation2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#mmParentOrganisation
 * Organisation.mmParentOrganisation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Organisation#mmBranch
 * Organisation.mmBranch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmOrganisation
 * OrganisationIdentification.mmOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Location#mmOperatingOrganisation
 * Location.mmOperatingOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Location#mmRegisteredOrganisation
 * Location.mmRegisteredOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#mmNewOrganisationInformation
 * SecuritiesModification.mmNewOrganisationInformation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Sector#mmOrganisation
 * Sector.mmOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RepresentativeOfficer#mmOrganisation
 * RepresentativeOfficer.mmOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#mmOrganisations
 * BuyOrSellIndicationOfInterest.mmOrganisations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationStrategy#mmOrganisation
 * OrganisationStrategy.mmOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationHierarchy#mmOrganisation
 * OrganisationHierarchy.mmOrganisation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeParty2#mmLegalOrganisation
 * TradeParty2.mmLegalOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItemReference4#mmDebtorAgent
 * OriginalItemReference4.mmDebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItemReference4#mmIntermediaryAgent
 * OriginalItemReference4.mmIntermediaryAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation7#mmDebtorAgent
 * OriginalPaymentInformation7.mmDebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation7#mmCreditorAgent
 * OriginalPaymentInformation7.mmCreditorAgent}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Party Party}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.FinancialInstitution
 * FinancialInstitution}</li>
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
 * "Organisation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Organised structure that is set up for a particular purpose. For example, a business, government body, department, charity, or financial institution."
 * </li>
 * </ul>
 */
public class Organisation extends Party {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text purpose;
	/**
	 * Purpose of the organisation, eg, charity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Purpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Purpose of the organisation, eg, charity."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPurpose = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Purpose";
			definition = "Purpose of the organisation, eg, charity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Organisation.class.getMethod("getPurpose", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime registrationDate;
	/**
	 * Date and time at which a given organisation was officially registered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation12#mmRegistrationDate
	 * Organisation12.mmRegistrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#mmRegistrationDate
	 * OrganisationModification1.mmRegistrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LegalOrganisation2#mmRegistrationDate
	 * LegalOrganisation2.mmRegistrationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which a given organisation was officially registered."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRegistrationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Organisation12.mmRegistrationDate, OrganisationModification1.mmRegistrationDate, LegalOrganisation2.mmRegistrationDate);
			elementContext_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegistrationDate";
			definition = "Date and time at which a given organisation was officially registered.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Organisation.class.getMethod("getRegistrationDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.OrganisationIdentification> organisationIdentification;
	/**
	 * Specific identification assigned to an organisation. It is derived from
	 * the association between Party and PartyIdentification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmOrganisation
	 * OrganisationIdentification.mmOrganisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5#mmFinancialInstitutionIdentification
	 * BranchAndFinancialInstitutionIdentification5.
	 * mmFinancialInstitutionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5#mmBranchIdentification
	 * BranchAndFinancialInstitutionIdentification5.mmBranchIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount25#mmServicer
	 * CashAccount25.mmServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation12#mmOrganisationIdentification
	 * Organisation12.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation14#mmOrganisationIdentification
	 * Organisation14.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#mmOrganisationIdentification
	 * OrganisationModification1.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountReport15#mmTransferAccountServicerIdentification
	 * AccountReport15.mmTransferAccountServicerIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesRecord1#mmAgent
	 * ChargesRecord1.mmAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents3#mmDebtorAgent
	 * TransactionAgents3.mmDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents3#mmCreditorAgent
	 * TransactionAgents3.mmCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents3#mmIntermediaryAgent1
	 * TransactionAgents3.mmIntermediaryAgent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents3#mmIntermediaryAgent2
	 * TransactionAgents3.mmIntermediaryAgent2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents3#mmIntermediaryAgent3
	 * TransactionAgents3.mmIntermediaryAgent3}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents3#mmReceivingAgent
	 * TransactionAgents3.mmReceivingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents3#mmDeliveringAgent
	 * TransactionAgents3.mmDeliveringAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents3#mmIssuingAgent
	 * TransactionAgents3.mmIssuingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents3#mmSettlementPlace
	 * TransactionAgents3.mmSettlementPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents3#mmProprietary
	 * TransactionAgents3.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesRecord2#mmAgent
	 * ChargesRecord2.mmAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader48#mmForwardingAgent
	 * GroupHeader48.mmForwardingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader55#mmForwardingAgent
	 * GroupHeader55.mmForwardingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction4#mmInstructingReimbursementAgent
	 * SettlementInstruction4.mmInstructingReimbursementAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader56#mmForwardingAgent
	 * GroupHeader56.mmForwardingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader56#mmDebtorAgent
	 * GroupHeader56.mmDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader56#mmCreditorAgent
	 * GroupHeader56.mmCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader52#mmForwardingAgent
	 * GroupHeader52.mmForwardingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader52#mmDebtorAgent
	 * GroupHeader52.mmDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader52#mmCreditorAgent
	 * GroupHeader52.mmCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader50#mmInstructingAgent
	 * GroupHeader50.mmInstructingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader50#mmInstructedAgent
	 * GroupHeader50.mmInstructedAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader53#mmInstructingAgent
	 * GroupHeader53.mmInstructingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader53#mmInstructedAgent
	 * GroupHeader53.mmInstructedAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader47#mmInstructingAgent
	 * GroupHeader47.mmInstructingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader47#mmInstructedAgent
	 * GroupHeader47.mmInstructedAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader46#mmDebtorAgent
	 * GroupHeader46.mmDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader46#mmCreditorAgent
	 * GroupHeader46.mmCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification4#mmFirstAgent
	 * PaymentIdentification4.mmFirstAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IdentificationInformation2#mmAgent
	 * IdentificationInformation2.mmAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest3#mmAccountServicer
	 * ReportingRequest3.mmAccountServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction3#mmInstructingReimbursementAgent
	 * SettlementInstruction3.mmInstructingReimbursementAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader63#mmInstructingAgent
	 * GroupHeader63.mmInstructingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader63#mmInstructedAgent
	 * GroupHeader63.mmInstructedAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation15#mmDebtorAgent
	 * DirectDebitTransactionInformation15.mmDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9#mmInstructingAgent
	 * CreditTransferTransaction9.mmInstructingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9#mmInstructedAgent
	 * CreditTransferTransaction9.mmInstructedAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9#mmIntermediaryAgent1
	 * CreditTransferTransaction9.mmIntermediaryAgent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9#mmIntermediaryAgent2
	 * CreditTransferTransaction9.mmIntermediaryAgent2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9#mmIntermediaryAgent3
	 * CreditTransferTransaction9.mmIntermediaryAgent3}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9#mmCreditorAgent
	 * CreditTransferTransaction9.mmCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9#mmCreditor
	 * CreditTransferTransaction9.mmCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9#mmUltimateCreditor
	 * CreditTransferTransaction9.mmUltimateCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader62#mmForwardingAgent
	 * GroupHeader62.mmForwardingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#mmPreviousInstructingAgent
	 * CreditTransferTransaction23.mmPreviousInstructingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#mmInstructingAgent
	 * CreditTransferTransaction23.mmInstructingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#mmInstructedAgent
	 * CreditTransferTransaction23.mmInstructedAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#mmIntermediaryAgent1
	 * CreditTransferTransaction23.mmIntermediaryAgent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#mmIntermediaryAgent2
	 * CreditTransferTransaction23.mmIntermediaryAgent2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#mmIntermediaryAgent3
	 * CreditTransferTransaction23.mmIntermediaryAgent3}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#mmCreditorAgent
	 * CreditTransferTransaction23.mmCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader70#mmInstructingAgent
	 * GroupHeader70.mmInstructingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader70#mmInstructedAgent
	 * GroupHeader70.mmInstructedAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification13#mmDebtorAgent
	 * AccountNotification13.mmDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification13#mmIntermediaryAgent
	 * AccountNotification13.mmIntermediaryAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmPreviousInstructingAgent
	 * CreditTransferTransaction25.mmPreviousInstructingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmInstructingAgent
	 * CreditTransferTransaction25.mmInstructingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmInstructedAgent
	 * CreditTransferTransaction25.mmInstructedAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmIntermediaryAgent1
	 * CreditTransferTransaction25.mmIntermediaryAgent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmIntermediaryAgent2
	 * CreditTransferTransaction25.mmIntermediaryAgent2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmIntermediaryAgent3
	 * CreditTransferTransaction25.mmIntermediaryAgent3}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmCreditorAgent
	 * CreditTransferTransaction25.mmCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader72#mmInstructingAgent
	 * GroupHeader72.mmInstructingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader72#mmInstructedAgent
	 * GroupHeader72.mmInstructedAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader71#mmInstructingAgent
	 * GroupHeader71.mmInstructingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader71#mmInstructedAgent
	 * GroupHeader71.mmInstructedAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference8#mmAccountServicer
	 * OriginalNotificationReference8.mmAccountServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference8#mmDebtorAgent
	 * OriginalNotificationReference8.mmDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference8#mmIntermediaryAgent
	 * OriginalNotificationReference8.mmIntermediaryAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#mmPreviousInstructingAgent
	 * CreditTransferTransaction24.mmPreviousInstructingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#mmIntermediaryAgent1
	 * CreditTransferTransaction24.mmIntermediaryAgent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#mmIntermediaryAgent2
	 * CreditTransferTransaction24.mmIntermediaryAgent2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#mmIntermediaryAgent3
	 * CreditTransferTransaction24.mmIntermediaryAgent3}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#mmCreditorAgent
	 * CreditTransferTransaction24.mmCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#mmIntermediaryAgent1
	 * CreditTransferTransaction26.mmIntermediaryAgent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#mmIntermediaryAgent2
	 * CreditTransferTransaction26.mmIntermediaryAgent2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#mmIntermediaryAgent3
	 * CreditTransferTransaction26.mmIntermediaryAgent3}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#mmCreditorAgent
	 * CreditTransferTransaction26.mmCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference4#mmAccountServicer
	 * OriginalItemReference4.mmAccountServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#mmIntermediaryAgent1
	 * CreditTransferTransaction22.mmIntermediaryAgent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#mmIntermediaryAgent2
	 * CreditTransferTransaction22.mmIntermediaryAgent2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#mmIntermediaryAgent3
	 * CreditTransferTransaction22.mmIntermediaryAgent3}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#mmCreditorAgent
	 * CreditTransferTransaction22.mmCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference7#mmAccountServicer
	 * OriginalNotificationReference7.mmAccountServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference7#mmDebtorAgent
	 * OriginalNotificationReference7.mmDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference7#mmIntermediaryAgent
	 * OriginalNotificationReference7.mmIntermediaryAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem6#mmAccountServicer
	 * NotificationItem6.mmAccountServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem6#mmDebtorAgent
	 * NotificationItem6.mmDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem6#mmIntermediaryAgent
	 * NotificationItem6.mmIntermediaryAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction73#mmInstructingAgent
	 * PaymentTransaction73.mmInstructingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction73#mmInstructedAgent
	 * PaymentTransaction73.mmInstructedAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction21#mmChargesAccountAgent
	 * PaymentInstruction21.mmChargesAccountAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmCreditorAgent
	 * DirectDebitTransactionInformation21.mmCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmInstructingAgent
	 * DirectDebitTransactionInformation21.mmInstructingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmInstructedAgent
	 * DirectDebitTransactionInformation21.mmInstructedAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmIntermediaryAgent1
	 * DirectDebitTransactionInformation21.mmIntermediaryAgent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmIntermediaryAgent2
	 * DirectDebitTransactionInformation21.mmIntermediaryAgent2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmIntermediaryAgent3
	 * DirectDebitTransactionInformation21.mmIntermediaryAgent3}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmDebtorAgent
	 * DirectDebitTransactionInformation21.mmDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction80#mmInstructingAgent
	 * PaymentTransaction80.mmInstructingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction80#mmInstructedAgent
	 * PaymentTransaction80.mmInstructedAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#mmInstructingAgent
	 * PaymentTransaction81.mmInstructingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#mmInstructedAgent
	 * PaymentTransaction81.mmInstructedAgent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate10#mmCreditorAgent
	 * Mandate10.mmCreditorAgent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate10#mmDebtorAgent
	 * Mandate10.mmDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23#mmDebtorAgent
	 * PaymentInstruction23.mmDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#mmInstructingAgent
	 * PaymentTransaction76.mmInstructingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#mmInstructedAgent
	 * PaymentTransaction76.mmInstructedAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#mmDebtorAgent
	 * PaymentInstruction22.mmDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#mmChargesAccountAgent
	 * PaymentInstruction22.mmChargesAccountAgent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate9#mmCreditorAgent
	 * Mandate9.mmCreditorAgent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate9#mmDebtorAgent
	 * Mandate9.mmDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference26#mmDebtorAgent
	 * OriginalTransactionReference26.mmDebtorAgent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#mmCreditorAgent
	 * Mandate11.mmCreditorAgent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#mmDebtorAgent
	 * Mandate11.mmDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#mmDebtorAgent
	 * DirectDebitTransactionInformation22.mmDebtorAgent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate8#mmCreditorAgent
	 * Mandate8.mmCreditorAgent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate8#mmDebtorAgent
	 * Mandate8.mmDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction75#mmAssigner
	 * PaymentTransaction75.mmAssigner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction75#mmAssignee
	 * PaymentTransaction75.mmAssignee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#mmOriginalCreditorAgent
	 * AmendmentInformationDetails11.mmOriginalCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#mmOriginalDebtorAgent
	 * AmendmentInformationDetails11.mmOriginalDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmDebtorAgent
	 * PaymentComplementaryInformation6.mmDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmIntermediaryAgent1
	 * PaymentComplementaryInformation6.mmIntermediaryAgent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmIntermediaryAgent2
	 * PaymentComplementaryInformation6.mmIntermediaryAgent2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmIntermediaryAgent3
	 * PaymentComplementaryInformation6.mmIntermediaryAgent3}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmPreviousInstructingAgent
	 * PaymentComplementaryInformation6.mmPreviousInstructingAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrganisationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specific identification assigned to an organisation. It is derived from the association between Party and PartyIdentification."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmOrganisationIdentification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(BranchAndFinancialInstitutionIdentification5.mmFinancialInstitutionIdentification, BranchAndFinancialInstitutionIdentification5.mmBranchIdentification, CashAccount25.mmServicer,
					Organisation12.mmOrganisationIdentification, Organisation14.mmOrganisationIdentification, OrganisationModification1.mmOrganisationIdentification, AccountReport15.mmTransferAccountServicerIdentification,
					ChargesRecord1.mmAgent, TransactionAgents3.mmDebtorAgent, TransactionAgents3.mmCreditorAgent, TransactionAgents3.mmIntermediaryAgent1, TransactionAgents3.mmIntermediaryAgent2, TransactionAgents3.mmIntermediaryAgent3,
					TransactionAgents3.mmReceivingAgent, TransactionAgents3.mmDeliveringAgent, TransactionAgents3.mmIssuingAgent, TransactionAgents3.mmSettlementPlace, TransactionAgents3.mmProprietary, ChargesRecord2.mmAgent,
					GroupHeader48.mmForwardingAgent, GroupHeader55.mmForwardingAgent, SettlementInstruction4.mmInstructingReimbursementAgent, GroupHeader56.mmForwardingAgent, GroupHeader56.mmDebtorAgent, GroupHeader56.mmCreditorAgent,
					GroupHeader52.mmForwardingAgent, GroupHeader52.mmDebtorAgent, GroupHeader52.mmCreditorAgent, GroupHeader50.mmInstructingAgent, GroupHeader50.mmInstructedAgent, GroupHeader53.mmInstructingAgent,
					GroupHeader53.mmInstructedAgent, GroupHeader47.mmInstructingAgent, GroupHeader47.mmInstructedAgent, GroupHeader46.mmDebtorAgent, GroupHeader46.mmCreditorAgent, PaymentIdentification4.mmFirstAgent,
					IdentificationInformation2.mmAgent, ReportingRequest3.mmAccountServicer, SettlementInstruction3.mmInstructingReimbursementAgent, GroupHeader63.mmInstructingAgent, GroupHeader63.mmInstructedAgent,
					DirectDebitTransactionInformation15.mmDebtorAgent, CreditTransferTransaction9.mmInstructingAgent, CreditTransferTransaction9.mmInstructedAgent, CreditTransferTransaction9.mmIntermediaryAgent1,
					CreditTransferTransaction9.mmIntermediaryAgent2, CreditTransferTransaction9.mmIntermediaryAgent3, CreditTransferTransaction9.mmCreditorAgent, CreditTransferTransaction9.mmCreditor,
					CreditTransferTransaction9.mmUltimateCreditor, GroupHeader62.mmForwardingAgent, CreditTransferTransaction23.mmPreviousInstructingAgent, CreditTransferTransaction23.mmInstructingAgent,
					CreditTransferTransaction23.mmInstructedAgent, CreditTransferTransaction23.mmIntermediaryAgent1, CreditTransferTransaction23.mmIntermediaryAgent2, CreditTransferTransaction23.mmIntermediaryAgent3,
					CreditTransferTransaction23.mmCreditorAgent, GroupHeader70.mmInstructingAgent, GroupHeader70.mmInstructedAgent, AccountNotification13.mmDebtorAgent, AccountNotification13.mmIntermediaryAgent,
					CreditTransferTransaction25.mmPreviousInstructingAgent, CreditTransferTransaction25.mmInstructingAgent, CreditTransferTransaction25.mmInstructedAgent, CreditTransferTransaction25.mmIntermediaryAgent1,
					CreditTransferTransaction25.mmIntermediaryAgent2, CreditTransferTransaction25.mmIntermediaryAgent3, CreditTransferTransaction25.mmCreditorAgent, GroupHeader72.mmInstructingAgent, GroupHeader72.mmInstructedAgent,
					GroupHeader71.mmInstructingAgent, GroupHeader71.mmInstructedAgent, OriginalNotificationReference8.mmAccountServicer, OriginalNotificationReference8.mmDebtorAgent, OriginalNotificationReference8.mmIntermediaryAgent,
					CreditTransferTransaction24.mmPreviousInstructingAgent, CreditTransferTransaction24.mmIntermediaryAgent1, CreditTransferTransaction24.mmIntermediaryAgent2, CreditTransferTransaction24.mmIntermediaryAgent3,
					CreditTransferTransaction24.mmCreditorAgent, CreditTransferTransaction26.mmIntermediaryAgent1, CreditTransferTransaction26.mmIntermediaryAgent2, CreditTransferTransaction26.mmIntermediaryAgent3,
					CreditTransferTransaction26.mmCreditorAgent, OriginalItemReference4.mmAccountServicer, CreditTransferTransaction22.mmIntermediaryAgent1, CreditTransferTransaction22.mmIntermediaryAgent2,
					CreditTransferTransaction22.mmIntermediaryAgent3, CreditTransferTransaction22.mmCreditorAgent, OriginalNotificationReference7.mmAccountServicer, OriginalNotificationReference7.mmDebtorAgent,
					OriginalNotificationReference7.mmIntermediaryAgent, NotificationItem6.mmAccountServicer, NotificationItem6.mmDebtorAgent, NotificationItem6.mmIntermediaryAgent, PaymentTransaction73.mmInstructingAgent,
					PaymentTransaction73.mmInstructedAgent, PaymentInstruction21.mmChargesAccountAgent, DirectDebitTransactionInformation21.mmCreditorAgent, DirectDebitTransactionInformation21.mmInstructingAgent,
					DirectDebitTransactionInformation21.mmInstructedAgent, DirectDebitTransactionInformation21.mmIntermediaryAgent1, DirectDebitTransactionInformation21.mmIntermediaryAgent2,
					DirectDebitTransactionInformation21.mmIntermediaryAgent3, DirectDebitTransactionInformation21.mmDebtorAgent, PaymentTransaction80.mmInstructingAgent, PaymentTransaction80.mmInstructedAgent,
					PaymentTransaction81.mmInstructingAgent, PaymentTransaction81.mmInstructedAgent, Mandate10.mmCreditorAgent, Mandate10.mmDebtorAgent, PaymentInstruction23.mmDebtorAgent, PaymentTransaction76.mmInstructingAgent,
					PaymentTransaction76.mmInstructedAgent, PaymentInstruction22.mmDebtorAgent, PaymentInstruction22.mmChargesAccountAgent, Mandate9.mmCreditorAgent, Mandate9.mmDebtorAgent, OriginalTransactionReference26.mmDebtorAgent,
					Mandate11.mmCreditorAgent, Mandate11.mmDebtorAgent, DirectDebitTransactionInformation22.mmDebtorAgent, Mandate8.mmCreditorAgent, Mandate8.mmDebtorAgent, PaymentTransaction75.mmAssigner, PaymentTransaction75.mmAssignee,
					AmendmentInformationDetails11.mmOriginalCreditorAgent, AmendmentInformationDetails11.mmOriginalDebtorAgent, PaymentComplementaryInformation6.mmDebtorAgent, PaymentComplementaryInformation6.mmIntermediaryAgent1,
					PaymentComplementaryInformation6.mmIntermediaryAgent2, PaymentComplementaryInformation6.mmIntermediaryAgent3, PaymentComplementaryInformation6.mmPreviousInstructingAgent);
			elementContext_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrganisationIdentification";
			definition = "Specific identification assigned to an organisation. It is derived from the association between Party and PartyIdentification.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.mmOrganisation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.mmObject();
		}
	};
	protected Organisation parentOrganisation;
	/**
	 * Organisation which is divided in branches.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmBranch
	 * Organisation.mmBranch}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Organisation
	 * Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParentOrganisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Organisation which is divided in branches."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmParentOrganisation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParentOrganisation";
			definition = "Organisation which is divided in branches.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Organisation.mmBranch;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Organisation> branch;
	/**
	 * Specifies an organisation which is not a head office.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmParentOrganisation
	 * Organisation.mmParentOrganisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Organisation
	 * Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Branch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies an organisation which is not a head office."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmBranch = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Branch";
			definition = "Specifies an organisation which is not a head office.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Organisation.mmParentOrganisation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
		}
	};
	protected SecuritiesModification securitiesModification;
	/**
	 * Specifies the process which originates the changes to an organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#mmNewOrganisationInformation
	 * SecuritiesModification.mmNewOrganisationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification
	 * SecuritiesModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesModification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the process which originates the changes to an organisation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesModification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesModification";
			definition = "Specifies the process which originates the changes to an organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesModification.mmNewOrganisationInformation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesModification.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Location> placeOfOperation;
	/**
	 * Place (including country) in which the organisation has its business
	 * activity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmOperatingOrganisation
	 * Location.mmOperatingOrganisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfOperation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place (including country) in which the organisation has its business activity."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPlaceOfOperation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PlaceOfOperation";
			definition = "Place (including country) in which the organisation has its business activity.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.mmOperatingOrganisation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}
	};
	protected Location placeOfRegistration;
	/**
	 * Place (including country) in which the organisation is registered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmRegisteredOrganisation
	 * Location.mmRegisteredOrganisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfRegistration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place (including country) in which the organisation is registered."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPlaceOfRegistration = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PlaceOfRegistration";
			definition = "Place (including country) in which the organisation is registered.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.mmRegisteredOrganisation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}
	};
	protected Max350Text description;
	/**
	 * Description of an organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Description"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Description of an organisation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDescription = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Description";
			definition = "Description of an organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Organisation.class.getMethod("getDescription", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected LegalStructureCode legalStructure;
	/**
	 * Legal standing of the organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.LegalStructureCode
	 * LegalStructureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalStructure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legal standing of the organisation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmLegalStructure = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LegalStructure";
			definition = "Legal standing of the organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LegalStructureCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Organisation.class.getMethod("getLegalStructure", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Sector sector;
	/**
	 * Sector of business of the organisation, for example, pharmaceutical.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Sector#mmOrganisation
	 * Sector.mmOrganisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Sector Sector}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sector"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sector of business of the organisation, for example, pharmaceutical."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSector = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Sector";
			definition = "Sector of business of the organisation, for example, pharmaceutical.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Sector.mmOrganisation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Sector.mmObject();
		}
	};
	protected BuyOrSellIndicationOfInterest relatedIndicationOfInterest;
	/**
	 * Indication of interest process for which a list of organisations is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#mmOrganisations
	 * BuyOrSellIndicationOfInterest.mmOrganisations}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest
	 * BuyOrSellIndicationOfInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedIndicationOfInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indication of interest process for which a list of organisations is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedIndicationOfInterest = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedIndicationOfInterest";
			definition = "Indication of interest process for which a list of organisations is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmOrganisations;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmObject();
		}
	};
	protected OrganisationStrategy strategy;
	/**
	 * Strategy related to an organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationStrategy#mmOrganisation
	 * OrganisationStrategy.mmOrganisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationStrategy
	 * OrganisationStrategy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Strategy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Strategy related to an organisation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmStrategy = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Strategy";
			definition = "Strategy related to an organisation.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.OrganisationStrategy.mmOrganisation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.OrganisationStrategy.mmObject();
		}
	};
	protected OrganisationHierarchy organisationHierarchy;
	/**
	 * Description of the structure of a company.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationHierarchy#mmOrganisation
	 * OrganisationHierarchy.mmOrganisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationHierarchy
	 * OrganisationHierarchy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrganisationHierarchy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Description of the structure of a company."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmOrganisationHierarchy = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrganisationHierarchy";
			definition = "Description of the structure of a company.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.OrganisationHierarchy.mmOrganisation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.OrganisationHierarchy.mmObject();
		}
	};
	protected RepresentativeOfficer representativeOfficer;
	/**
	 * Officer who has some rights to represent a given organisation. In account
	 * management, it is the person to be contacted by the account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RepresentativeOfficer#mmOrganisation
	 * RepresentativeOfficer.mmOrganisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.RepresentativeOfficer
	 * RepresentativeOfficer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepresentativeOfficer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Officer who has some rights to represent a given organisation. In account management, it is the person to be contacted by the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRepresentativeOfficer = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RepresentativeOfficer";
			definition = "Officer who has some rights to represent a given organisation. In account management, it is the person to be contacted by the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RepresentativeOfficer.mmOrganisation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RepresentativeOfficer.mmObject();
		}
	};
	protected ISODate establishmentDate;
	/**
	 * Date when the organisation was established.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LegalOrganisation2#mmEstablishmentDate
	 * LegalOrganisation2.mmEstablishmentDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstablishmentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date when the organisation was established."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmEstablishmentDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(LegalOrganisation2.mmEstablishmentDate);
			elementContext_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EstablishmentDate";
			definition = "Date when the organisation was established.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Organisation.class.getMethod("getEstablishmentDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Organisation";
				definition = "Organised structure that is set up for a particular purpose. For example, a business, government body, department, charity, or financial institution.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Organisation.mmParentOrganisation, com.tools20022.repository.entity.Organisation.mmBranch,
						com.tools20022.repository.entity.OrganisationIdentification.mmOrganisation, com.tools20022.repository.entity.Location.mmOperatingOrganisation, com.tools20022.repository.entity.Location.mmRegisteredOrganisation,
						com.tools20022.repository.entity.SecuritiesModification.mmNewOrganisationInformation, com.tools20022.repository.entity.Sector.mmOrganisation, com.tools20022.repository.entity.RepresentativeOfficer.mmOrganisation,
						com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmOrganisations, com.tools20022.repository.entity.OrganisationStrategy.mmOrganisation,
						com.tools20022.repository.entity.OrganisationHierarchy.mmOrganisation);
				derivationElement_lazy = () -> Arrays.asList(TradeParty2.mmLegalOrganisation, OriginalItemReference4.mmDebtorAgent, OriginalItemReference4.mmIntermediaryAgent, OriginalPaymentInformation7.mmDebtorAgent,
						OriginalPaymentInformation7.mmCreditorAgent);
				subType_lazy = () -> Arrays.asList(FinancialInstitution.mmObject());
				superType_lazy = () -> Party.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Organisation.mmPurpose, com.tools20022.repository.entity.Organisation.mmRegistrationDate,
						com.tools20022.repository.entity.Organisation.mmOrganisationIdentification, com.tools20022.repository.entity.Organisation.mmParentOrganisation, com.tools20022.repository.entity.Organisation.mmBranch,
						com.tools20022.repository.entity.Organisation.mmSecuritiesModification, com.tools20022.repository.entity.Organisation.mmPlaceOfOperation, com.tools20022.repository.entity.Organisation.mmPlaceOfRegistration,
						com.tools20022.repository.entity.Organisation.mmDescription, com.tools20022.repository.entity.Organisation.mmLegalStructure, com.tools20022.repository.entity.Organisation.mmSector,
						com.tools20022.repository.entity.Organisation.mmRelatedIndicationOfInterest, com.tools20022.repository.entity.Organisation.mmStrategy, com.tools20022.repository.entity.Organisation.mmOrganisationHierarchy,
						com.tools20022.repository.entity.Organisation.mmRepresentativeOfficer, com.tools20022.repository.entity.Organisation.mmEstablishmentDate);
				derivationComponent_lazy = () -> Arrays.asList(BranchAndFinancialInstitutionIdentification5.mmObject(), Organisation12.mmObject(), Organisation14.mmObject(), OrganisationModification1.mmObject(),
						LegalOrganisation2.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Organisation.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getPurpose() {
		return purpose;
	}

	public void setPurpose(Max35Text purpose) {
		this.purpose = purpose;
	}

	public ISODateTime getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(ISODateTime registrationDate) {
		this.registrationDate = registrationDate;
	}

	public List<OrganisationIdentification> getOrganisationIdentification() {
		return organisationIdentification;
	}

	public void setOrganisationIdentification(List<com.tools20022.repository.entity.OrganisationIdentification> organisationIdentification) {
		this.organisationIdentification = organisationIdentification;
	}

	public Organisation getParentOrganisation() {
		return parentOrganisation;
	}

	public void setParentOrganisation(com.tools20022.repository.entity.Organisation parentOrganisation) {
		this.parentOrganisation = parentOrganisation;
	}

	public List<Organisation> getBranch() {
		return branch;
	}

	public void setBranch(List<com.tools20022.repository.entity.Organisation> branch) {
		this.branch = branch;
	}

	public SecuritiesModification getSecuritiesModification() {
		return securitiesModification;
	}

	public void setSecuritiesModification(com.tools20022.repository.entity.SecuritiesModification securitiesModification) {
		this.securitiesModification = securitiesModification;
	}

	public List<Location> getPlaceOfOperation() {
		return placeOfOperation;
	}

	public void setPlaceOfOperation(List<com.tools20022.repository.entity.Location> placeOfOperation) {
		this.placeOfOperation = placeOfOperation;
	}

	public Location getPlaceOfRegistration() {
		return placeOfRegistration;
	}

	public void setPlaceOfRegistration(com.tools20022.repository.entity.Location placeOfRegistration) {
		this.placeOfRegistration = placeOfRegistration;
	}

	public Max350Text getDescription() {
		return description;
	}

	public void setDescription(Max350Text description) {
		this.description = description;
	}

	public LegalStructureCode getLegalStructure() {
		return legalStructure;
	}

	public void setLegalStructure(LegalStructureCode legalStructure) {
		this.legalStructure = legalStructure;
	}

	public Sector getSector() {
		return sector;
	}

	public void setSector(com.tools20022.repository.entity.Sector sector) {
		this.sector = sector;
	}

	public BuyOrSellIndicationOfInterest getRelatedIndicationOfInterest() {
		return relatedIndicationOfInterest;
	}

	public void setRelatedIndicationOfInterest(com.tools20022.repository.entity.BuyOrSellIndicationOfInterest relatedIndicationOfInterest) {
		this.relatedIndicationOfInterest = relatedIndicationOfInterest;
	}

	public OrganisationStrategy getStrategy() {
		return strategy;
	}

	public void setStrategy(com.tools20022.repository.entity.OrganisationStrategy strategy) {
		this.strategy = strategy;
	}

	public OrganisationHierarchy getOrganisationHierarchy() {
		return organisationHierarchy;
	}

	public void setOrganisationHierarchy(com.tools20022.repository.entity.OrganisationHierarchy organisationHierarchy) {
		this.organisationHierarchy = organisationHierarchy;
	}

	public RepresentativeOfficer getRepresentativeOfficer() {
		return representativeOfficer;
	}

	public void setRepresentativeOfficer(com.tools20022.repository.entity.RepresentativeOfficer representativeOfficer) {
		this.representativeOfficer = representativeOfficer;
	}

	public ISODate getEstablishmentDate() {
		return establishmentDate;
	}

	public void setEstablishmentDate(ISODate establishmentDate) {
		this.establishmentDate = establishmentDate;
	}
}