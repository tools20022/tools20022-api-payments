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

import com.tools20022.metamodel.ext.OtherSemanticMarkup;
import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.LegalStructureCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Party Party}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.FinancialInstitution
 * FinancialInstitution}</li>
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
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = type=SampleData, SampleData=<?xml version="1.0"
	 * encoding="UTF-8"?> <InstanceInfo> <key KeyValue="Sample1"/> <key
	 * KeyValue="Sample2"/> <key KeyValue="Sample3"/> <key KeyValue="Sample4"/>
	 * <key KeyValue="Sample5"/> <key KeyValue="Sample6"/> <key
	 * KeyValue="Sample7"/> <key KeyValue="Sample8"/> <key KeyValue="Sample9"/>
	 * <key KeyValue="Sample10"/> </InstanceInfo>
	 * 
	 * 
	 * </li>
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
	public static final MMBusinessAttribute<Organisation, Max35Text> mmPurpose = new MMBusinessAttribute<Organisation, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Organisation.mmObject();
			semanticMarkup_lazy = () -> Arrays
					.asList(new OtherSemanticMarkup(
							this,
							"SampleData",
							new String[]{
									"SampleData",
									"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<InstanceInfo>\n<key KeyValue=\"Sample1\"/>\n<key KeyValue=\"Sample2\"/>\n<key KeyValue=\"Sample3\"/>\n<key KeyValue=\"Sample4\"/>\n<key KeyValue=\"Sample5\"/>\n<key KeyValue=\"Sample6\"/>\n<key KeyValue=\"Sample7\"/>\n<key KeyValue=\"Sample8\"/>\n<key KeyValue=\"Sample9\"/>\n<key KeyValue=\"Sample10\"/>\n</InstanceInfo>\n\n\n"}));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Purpose";
			definition = "Purpose of the organisation, eg, charity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Organisation obj) {
			return obj.getPurpose();
		}

		@Override
		public void setValue(Organisation obj, Max35Text value) {
			obj.setPurpose(value);
		}
	};
	protected ISODateTime registrationDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = type=SampleData, SampleData=<?xml version="1.0"
	 * encoding="UTF-8"?> <InstanceInfo> <key KeyValue="Sample1"/> <key
	 * KeyValue="Sample2"/> <key KeyValue="Sample3"/> <key KeyValue="Sample4"/>
	 * <key KeyValue="Sample5"/> <key KeyValue="Sample6"/> <key
	 * KeyValue="Sample7"/> <key KeyValue="Sample8"/> <key KeyValue="Sample9"/>
	 * <key KeyValue="Sample10"/> </InstanceInfo>
	 * 
	 * 
	 * </li>
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
	public static final MMBusinessAttribute<Organisation, ISODateTime> mmRegistrationDate = new MMBusinessAttribute<Organisation, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(Organisation12.mmRegistrationDate, OrganisationModification1.mmRegistrationDate, LegalOrganisation2.mmRegistrationDate);
			isDerived = false;
			elementContext_lazy = () -> Organisation.mmObject();
			semanticMarkup_lazy = () -> Arrays
					.asList(new OtherSemanticMarkup(
							this,
							"SampleData",
							new String[]{
									"SampleData",
									"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<InstanceInfo>\n<key KeyValue=\"Sample1\"/>\n<key KeyValue=\"Sample2\"/>\n<key KeyValue=\"Sample3\"/>\n<key KeyValue=\"Sample4\"/>\n<key KeyValue=\"Sample5\"/>\n<key KeyValue=\"Sample6\"/>\n<key KeyValue=\"Sample7\"/>\n<key KeyValue=\"Sample8\"/>\n<key KeyValue=\"Sample9\"/>\n<key KeyValue=\"Sample10\"/>\n</InstanceInfo>\n\n\n"}));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegistrationDate";
			definition = "Date and time at which a given organisation was officially registered.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Organisation obj) {
			return obj.getRegistrationDate();
		}

		@Override
		public void setValue(Organisation obj, ISODateTime value) {
			obj.setRegistrationDate(value);
		}
	};
	protected List<com.tools20022.repository.entity.OrganisationIdentification> organisationIdentification;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate10#mmCreditorAgent
	 * Mandate10.mmCreditorAgent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate10#mmDebtorAgent
	 * Mandate10.mmDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23#mmDebtorAgent
	 * PaymentInstruction23.mmDebtorAgent}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#mmOriginalCreditorAgent
	 * AmendmentInformationDetails11.mmOriginalCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#mmOriginalDebtorAgent
	 * AmendmentInformationDetails11.mmOriginalDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction24#mmDebtorAgent
	 * PaymentInstruction24.mmDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction24#mmChargesAccountAgent
	 * PaymentInstruction24.mmChargesAccountAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction27#mmIntermediaryAgent1
	 * CreditTransferTransaction27.mmIntermediaryAgent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction27#mmIntermediaryAgent2
	 * CreditTransferTransaction27.mmIntermediaryAgent2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction27#mmIntermediaryAgent3
	 * CreditTransferTransaction27.mmIntermediaryAgent3}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction27#mmCreditorAgent
	 * CreditTransferTransaction27.mmCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation7#mmDebtorAgent
	 * PaymentComplementaryInformation7.mmDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation7#mmIntermediaryAgent1
	 * PaymentComplementaryInformation7.mmIntermediaryAgent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation7#mmIntermediaryAgent2
	 * PaymentComplementaryInformation7.mmIntermediaryAgent2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation7#mmIntermediaryAgent3
	 * PaymentComplementaryInformation7.mmIntermediaryAgent3}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation7#mmPreviousInstructingAgent1
	 * PaymentComplementaryInformation7.mmPreviousInstructingAgent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation7#mmPreviousInstructingAgent2
	 * PaymentComplementaryInformation7.mmPreviousInstructingAgent2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation7#mmPreviousInstructingAgent3
	 * PaymentComplementaryInformation7.mmPreviousInstructingAgent3}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction87#mmInstructingAgent
	 * PaymentTransaction87.mmInstructingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction87#mmInstructedAgent
	 * PaymentTransaction87.mmInstructedAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction31#mmPreviousInstructingAgent1
	 * CreditTransferTransaction31.mmPreviousInstructingAgent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction31#mmPreviousInstructingAgent2
	 * CreditTransferTransaction31.mmPreviousInstructingAgent2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction31#mmPreviousInstructingAgent3
	 * CreditTransferTransaction31.mmPreviousInstructingAgent3}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction31#mmInstructingAgent
	 * CreditTransferTransaction31.mmInstructingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction31#mmInstructedAgent
	 * CreditTransferTransaction31.mmInstructedAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction31#mmIntermediaryAgent1
	 * CreditTransferTransaction31.mmIntermediaryAgent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction31#mmIntermediaryAgent2
	 * CreditTransferTransaction31.mmIntermediaryAgent2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction31#mmIntermediaryAgent3
	 * CreditTransferTransaction31.mmIntermediaryAgent3}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction31#mmCreditorAgent
	 * CreditTransferTransaction31.mmCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction88#mmInstructingAgent
	 * PaymentTransaction88.mmInstructingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction88#mmInstructedAgent
	 * PaymentTransaction88.mmInstructedAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest4#mmAccountServicer
	 * ReportingRequest4.mmAccountServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction91#mmInstructingAgent
	 * PaymentTransaction91.mmInstructingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction91#mmInstructedAgent
	 * PaymentTransaction91.mmInstructedAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents4#mmInstructingAgent
	 * TransactionAgents4.mmInstructingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents4#mmInstructedAgent
	 * TransactionAgents4.mmInstructedAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents4#mmDebtorAgent
	 * TransactionAgents4.mmDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents4#mmCreditorAgent
	 * TransactionAgents4.mmCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents4#mmIntermediaryAgent1
	 * TransactionAgents4.mmIntermediaryAgent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents4#mmIntermediaryAgent2
	 * TransactionAgents4.mmIntermediaryAgent2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents4#mmIntermediaryAgent3
	 * TransactionAgents4.mmIntermediaryAgent3}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents4#mmReceivingAgent
	 * TransactionAgents4.mmReceivingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents4#mmDeliveringAgent
	 * TransactionAgents4.mmDeliveringAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents4#mmIssuingAgent
	 * TransactionAgents4.mmIssuingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents4#mmSettlementPlace
	 * TransactionAgents4.mmSettlementPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents4#mmProprietary
	 * TransactionAgents4.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction89#mmAssigner
	 * PaymentTransaction89.mmAssigner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction89#mmAssignee
	 * PaymentTransaction89.mmAssignee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionParties5#mmPreviousInstructingAgent1
	 * TransactionParties5.mmPreviousInstructingAgent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionParties5#mmPreviousInstructingAgent2
	 * TransactionParties5.mmPreviousInstructingAgent2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionParties5#mmPreviousInstructingAgent3
	 * TransactionParties5.mmPreviousInstructingAgent3}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionParties5#mmIntermediaryAgent1
	 * TransactionParties5.mmIntermediaryAgent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionParties5#mmIntermediaryAgent2
	 * TransactionParties5.mmIntermediaryAgent2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionParties5#mmIntermediaryAgent3
	 * TransactionParties5.mmIntermediaryAgent3}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionParties5#mmCreditorAgent
	 * TransactionParties5.mmCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction32#mmPreviousInstructingAgent1
	 * CreditTransferTransaction32.mmPreviousInstructingAgent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction32#mmPreviousInstructingAgent2
	 * CreditTransferTransaction32.mmPreviousInstructingAgent2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction32#mmPreviousInstructingAgent3
	 * CreditTransferTransaction32.mmPreviousInstructingAgent3}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction32#mmIntermediaryAgent1
	 * CreditTransferTransaction32.mmIntermediaryAgent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction32#mmIntermediaryAgent2
	 * CreditTransferTransaction32.mmIntermediaryAgent2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction32#mmIntermediaryAgent3
	 * CreditTransferTransaction32.mmIntermediaryAgent3}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction32#mmCreditorAgent
	 * CreditTransferTransaction32.mmCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction30#mmPreviousInstructingAgent1
	 * CreditTransferTransaction30.mmPreviousInstructingAgent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction30#mmPreviousInstructingAgent2
	 * CreditTransferTransaction30.mmPreviousInstructingAgent2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction30#mmPreviousInstructingAgent3
	 * CreditTransferTransaction30.mmPreviousInstructingAgent3}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction30#mmInstructingAgent
	 * CreditTransferTransaction30.mmInstructingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction30#mmInstructedAgent
	 * CreditTransferTransaction30.mmInstructedAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction30#mmIntermediaryAgent1
	 * CreditTransferTransaction30.mmIntermediaryAgent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction30#mmIntermediaryAgent2
	 * CreditTransferTransaction30.mmIntermediaryAgent2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction30#mmIntermediaryAgent3
	 * CreditTransferTransaction30.mmIntermediaryAgent3}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction30#mmCreditorAgent
	 * CreditTransferTransaction30.mmCreditorAgent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount36#mmServicer
	 * CashAccount36.mmServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction94#mmInstructingAgent
	 * PaymentTransaction94.mmInstructingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction94#mmInstructedAgent
	 * PaymentTransaction94.mmInstructedAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader74#mmForwardingAgent
	 * GroupHeader74.mmForwardingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader74#mmDebtorAgent
	 * GroupHeader74.mmDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader74#mmCreditorAgent
	 * GroupHeader74.mmCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader75#mmForwardingAgent
	 * GroupHeader75.mmForwardingAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader75#mmDebtorAgent
	 * GroupHeader75.mmDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader75#mmCreditorAgent
	 * GroupHeader75.mmCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails12#mmOriginalCreditorAgent
	 * AmendmentInformationDetails12.mmOriginalCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails12#mmOriginalDebtorAgent
	 * AmendmentInformationDetails12.mmOriginalDebtorAgent}</li>
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
	public static final MMBusinessAssociationEnd<Organisation, List<OrganisationIdentification>> mmOrganisationIdentification = new MMBusinessAssociationEnd<Organisation, List<OrganisationIdentification>>() {
		{
			derivation_lazy = () -> Arrays.asList(BranchAndFinancialInstitutionIdentification5.mmFinancialInstitutionIdentification, BranchAndFinancialInstitutionIdentification5.mmBranchIdentification, CashAccount25.mmServicer,
					Organisation12.mmOrganisationIdentification, Organisation14.mmOrganisationIdentification, OrganisationModification1.mmOrganisationIdentification, AccountReport15.mmTransferAccountServicerIdentification,
					ChargesRecord1.mmAgent, ChargesRecord2.mmAgent, GroupHeader48.mmForwardingAgent, GroupHeader55.mmForwardingAgent, SettlementInstruction4.mmInstructingReimbursementAgent, GroupHeader50.mmInstructingAgent,
					GroupHeader50.mmInstructedAgent, GroupHeader53.mmInstructingAgent, GroupHeader53.mmInstructedAgent, GroupHeader47.mmInstructingAgent, GroupHeader47.mmInstructedAgent, GroupHeader46.mmDebtorAgent,
					GroupHeader46.mmCreditorAgent, PaymentIdentification4.mmFirstAgent, IdentificationInformation2.mmAgent, SettlementInstruction3.mmInstructingReimbursementAgent, GroupHeader63.mmInstructingAgent,
					GroupHeader63.mmInstructedAgent, DirectDebitTransactionInformation15.mmDebtorAgent, CreditTransferTransaction9.mmInstructingAgent, CreditTransferTransaction9.mmInstructedAgent,
					CreditTransferTransaction9.mmIntermediaryAgent1, CreditTransferTransaction9.mmIntermediaryAgent2, CreditTransferTransaction9.mmIntermediaryAgent3, CreditTransferTransaction9.mmCreditorAgent,
					CreditTransferTransaction9.mmCreditor, CreditTransferTransaction9.mmUltimateCreditor, GroupHeader62.mmForwardingAgent, GroupHeader70.mmInstructingAgent, GroupHeader70.mmInstructedAgent,
					AccountNotification13.mmDebtorAgent, AccountNotification13.mmIntermediaryAgent, GroupHeader72.mmInstructingAgent, GroupHeader72.mmInstructedAgent, GroupHeader71.mmInstructingAgent, GroupHeader71.mmInstructedAgent,
					OriginalNotificationReference8.mmAccountServicer, OriginalNotificationReference8.mmDebtorAgent, OriginalNotificationReference8.mmIntermediaryAgent, CreditTransferTransaction26.mmIntermediaryAgent1,
					CreditTransferTransaction26.mmIntermediaryAgent2, CreditTransferTransaction26.mmIntermediaryAgent3, CreditTransferTransaction26.mmCreditorAgent, OriginalItemReference4.mmAccountServicer,
					CreditTransferTransaction22.mmIntermediaryAgent1, CreditTransferTransaction22.mmIntermediaryAgent2, CreditTransferTransaction22.mmIntermediaryAgent3, CreditTransferTransaction22.mmCreditorAgent,
					OriginalNotificationReference7.mmAccountServicer, OriginalNotificationReference7.mmDebtorAgent, OriginalNotificationReference7.mmIntermediaryAgent, NotificationItem6.mmAccountServicer, NotificationItem6.mmDebtorAgent,
					NotificationItem6.mmIntermediaryAgent, PaymentInstruction21.mmChargesAccountAgent, DirectDebitTransactionInformation21.mmCreditorAgent, DirectDebitTransactionInformation21.mmInstructingAgent,
					DirectDebitTransactionInformation21.mmInstructedAgent, DirectDebitTransactionInformation21.mmIntermediaryAgent1, DirectDebitTransactionInformation21.mmIntermediaryAgent2,
					DirectDebitTransactionInformation21.mmIntermediaryAgent3, DirectDebitTransactionInformation21.mmDebtorAgent, Mandate10.mmCreditorAgent, Mandate10.mmDebtorAgent, PaymentInstruction23.mmDebtorAgent,
					PaymentInstruction22.mmDebtorAgent, PaymentInstruction22.mmChargesAccountAgent, Mandate9.mmCreditorAgent, Mandate9.mmDebtorAgent, OriginalTransactionReference26.mmDebtorAgent, Mandate11.mmCreditorAgent,
					Mandate11.mmDebtorAgent, DirectDebitTransactionInformation22.mmDebtorAgent, Mandate8.mmCreditorAgent, Mandate8.mmDebtorAgent, AmendmentInformationDetails11.mmOriginalCreditorAgent,
					AmendmentInformationDetails11.mmOriginalDebtorAgent, PaymentInstruction24.mmDebtorAgent, PaymentInstruction24.mmChargesAccountAgent, CreditTransferTransaction27.mmIntermediaryAgent1,
					CreditTransferTransaction27.mmIntermediaryAgent2, CreditTransferTransaction27.mmIntermediaryAgent3, CreditTransferTransaction27.mmCreditorAgent, PaymentComplementaryInformation7.mmDebtorAgent,
					PaymentComplementaryInformation7.mmIntermediaryAgent1, PaymentComplementaryInformation7.mmIntermediaryAgent2, PaymentComplementaryInformation7.mmIntermediaryAgent3,
					PaymentComplementaryInformation7.mmPreviousInstructingAgent1, PaymentComplementaryInformation7.mmPreviousInstructingAgent2, PaymentComplementaryInformation7.mmPreviousInstructingAgent3,
					PaymentTransaction87.mmInstructingAgent, PaymentTransaction87.mmInstructedAgent, CreditTransferTransaction31.mmPreviousInstructingAgent1, CreditTransferTransaction31.mmPreviousInstructingAgent2,
					CreditTransferTransaction31.mmPreviousInstructingAgent3, CreditTransferTransaction31.mmInstructingAgent, CreditTransferTransaction31.mmInstructedAgent, CreditTransferTransaction31.mmIntermediaryAgent1,
					CreditTransferTransaction31.mmIntermediaryAgent2, CreditTransferTransaction31.mmIntermediaryAgent3, CreditTransferTransaction31.mmCreditorAgent, PaymentTransaction88.mmInstructingAgent,
					PaymentTransaction88.mmInstructedAgent, ReportingRequest4.mmAccountServicer, PaymentTransaction91.mmInstructingAgent, PaymentTransaction91.mmInstructedAgent, TransactionAgents4.mmInstructingAgent,
					TransactionAgents4.mmInstructedAgent, TransactionAgents4.mmDebtorAgent, TransactionAgents4.mmCreditorAgent, TransactionAgents4.mmIntermediaryAgent1, TransactionAgents4.mmIntermediaryAgent2,
					TransactionAgents4.mmIntermediaryAgent3, TransactionAgents4.mmReceivingAgent, TransactionAgents4.mmDeliveringAgent, TransactionAgents4.mmIssuingAgent, TransactionAgents4.mmSettlementPlace,
					TransactionAgents4.mmProprietary, PaymentTransaction89.mmAssigner, PaymentTransaction89.mmAssignee, TransactionParties5.mmPreviousInstructingAgent1, TransactionParties5.mmPreviousInstructingAgent2,
					TransactionParties5.mmPreviousInstructingAgent3, TransactionParties5.mmIntermediaryAgent1, TransactionParties5.mmIntermediaryAgent2, TransactionParties5.mmIntermediaryAgent3, TransactionParties5.mmCreditorAgent,
					CreditTransferTransaction32.mmPreviousInstructingAgent1, CreditTransferTransaction32.mmPreviousInstructingAgent2, CreditTransferTransaction32.mmPreviousInstructingAgent3,
					CreditTransferTransaction32.mmIntermediaryAgent1, CreditTransferTransaction32.mmIntermediaryAgent2, CreditTransferTransaction32.mmIntermediaryAgent3, CreditTransferTransaction32.mmCreditorAgent,
					CreditTransferTransaction30.mmPreviousInstructingAgent1, CreditTransferTransaction30.mmPreviousInstructingAgent2, CreditTransferTransaction30.mmPreviousInstructingAgent3, CreditTransferTransaction30.mmInstructingAgent,
					CreditTransferTransaction30.mmInstructedAgent, CreditTransferTransaction30.mmIntermediaryAgent1, CreditTransferTransaction30.mmIntermediaryAgent2, CreditTransferTransaction30.mmIntermediaryAgent3,
					CreditTransferTransaction30.mmCreditorAgent, CashAccount36.mmServicer, PaymentTransaction94.mmInstructingAgent, PaymentTransaction94.mmInstructedAgent, GroupHeader74.mmForwardingAgent, GroupHeader74.mmDebtorAgent,
					GroupHeader74.mmCreditorAgent, GroupHeader75.mmForwardingAgent, GroupHeader75.mmDebtorAgent, GroupHeader75.mmCreditorAgent, AmendmentInformationDetails12.mmOriginalCreditorAgent,
					AmendmentInformationDetails12.mmOriginalDebtorAgent);
			isDerived = false;
			elementContext_lazy = () -> Organisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrganisationIdentification";
			definition = "Specific identification assigned to an organisation. It is derived from the association between Party and PartyIdentification.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.mmOrganisation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.mmObject();
		}

		@Override
		public List<OrganisationIdentification> getValue(Organisation obj) {
			return obj.getOrganisationIdentification();
		}

		@Override
		public void setValue(Organisation obj, List<OrganisationIdentification> value) {
			obj.setOrganisationIdentification(value);
		}
	};
	protected Organisation parentOrganisation;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Organisation, Organisation> mmParentOrganisation = new MMBusinessAssociationEnd<Organisation, Organisation>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Organisation.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParentOrganisation";
			definition = "Organisation which is divided in branches.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Organisation.mmBranch;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Organisation.mmObject();
		}

		@Override
		public Organisation getValue(Organisation obj) {
			return obj.getParentOrganisation();
		}

		@Override
		public void setValue(Organisation obj, Organisation value) {
			obj.setParentOrganisation(value);
		}
	};
	protected List<Organisation> branch;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Organisation, List<Organisation>> mmBranch = new MMBusinessAssociationEnd<Organisation, List<Organisation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Organisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Branch";
			definition = "Specifies an organisation which is not a head office.";
			minOccurs = 0;
			opposite_lazy = () -> Organisation.mmParentOrganisation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Organisation.mmObject();
		}

		@Override
		public List<Organisation> getValue(Organisation obj) {
			return obj.getBranch();
		}

		@Override
		public void setValue(Organisation obj, List<Organisation> value) {
			obj.setBranch(value);
		}
	};
	protected SecuritiesModification securitiesModification;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Organisation, com.tools20022.repository.entity.SecuritiesModification> mmSecuritiesModification = new MMBusinessAssociationEnd<Organisation, com.tools20022.repository.entity.SecuritiesModification>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Organisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesModification";
			definition = "Specifies the process which originates the changes to an organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesModification.mmNewOrganisationInformation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesModification.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.SecuritiesModification getValue(Organisation obj) {
			return obj.getSecuritiesModification();
		}

		@Override
		public void setValue(Organisation obj, com.tools20022.repository.entity.SecuritiesModification value) {
			obj.setSecuritiesModification(value);
		}
	};
	protected List<com.tools20022.repository.entity.Location> placeOfOperation;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Organisation, List<Location>> mmPlaceOfOperation = new MMBusinessAssociationEnd<Organisation, List<Location>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Organisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PlaceOfOperation";
			definition = "Place (including country) in which the organisation has its business activity.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.mmOperatingOrganisation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}

		@Override
		public List<Location> getValue(Organisation obj) {
			return obj.getPlaceOfOperation();
		}

		@Override
		public void setValue(Organisation obj, List<Location> value) {
			obj.setPlaceOfOperation(value);
		}
	};
	protected Location placeOfRegistration;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Organisation, Optional<Location>> mmPlaceOfRegistration = new MMBusinessAssociationEnd<Organisation, Optional<Location>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Organisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PlaceOfRegistration";
			definition = "Place (including country) in which the organisation is registered.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.mmRegisteredOrganisation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}

		@Override
		public Optional<Location> getValue(Organisation obj) {
			return obj.getPlaceOfRegistration();
		}

		@Override
		public void setValue(Organisation obj, Optional<Location> value) {
			obj.setPlaceOfRegistration(value.orElse(null));
		}
	};
	protected Max350Text description;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = type=SampleData, SampleData=<?xml version="1.0"
	 * encoding="UTF-8"?> <InstanceInfo> <key KeyValue="Sample1"/> <key
	 * KeyValue="Sample2"/> <key KeyValue="Sample3"/> <key KeyValue="Sample4"/>
	 * <key KeyValue="Sample5"/> <key KeyValue="Sample6"/> <key
	 * KeyValue="Sample7"/> <key KeyValue="Sample8"/> <key KeyValue="Sample9"/>
	 * <key KeyValue="Sample10"/> </InstanceInfo>
	 * 
	 * 
	 * </li>
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
	public static final MMBusinessAttribute<Organisation, Max350Text> mmDescription = new MMBusinessAttribute<Organisation, Max350Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Organisation.mmObject();
			semanticMarkup_lazy = () -> Arrays
					.asList(new OtherSemanticMarkup(
							this,
							"SampleData",
							new String[]{
									"SampleData",
									"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<InstanceInfo>\n<key KeyValue=\"Sample1\"/>\n<key KeyValue=\"Sample2\"/>\n<key KeyValue=\"Sample3\"/>\n<key KeyValue=\"Sample4\"/>\n<key KeyValue=\"Sample5\"/>\n<key KeyValue=\"Sample6\"/>\n<key KeyValue=\"Sample7\"/>\n<key KeyValue=\"Sample8\"/>\n<key KeyValue=\"Sample9\"/>\n<key KeyValue=\"Sample10\"/>\n</InstanceInfo>\n\n\n"}));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Description";
			definition = "Description of an organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(Organisation obj) {
			return obj.getDescription();
		}

		@Override
		public void setValue(Organisation obj, Max350Text value) {
			obj.setDescription(value);
		}
	};
	protected LegalStructureCode legalStructure;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.LegalStructureCode
	 * LegalStructureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation20#mmOrganisationLegalStatus
	 * Organisation20.mmOrganisationLegalStatus}</li>
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
	 * name} = "LegalStructure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legal standing of the organisation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Organisation, LegalStructureCode> mmLegalStructure = new MMBusinessAttribute<Organisation, LegalStructureCode>() {
		{
			derivation_lazy = () -> Arrays.asList(Organisation20.mmOrganisationLegalStatus);
			isDerived = false;
			elementContext_lazy = () -> Organisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LegalStructure";
			definition = "Legal standing of the organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LegalStructureCode.mmObject();
		}

		@Override
		public LegalStructureCode getValue(Organisation obj) {
			return obj.getLegalStructure();
		}

		@Override
		public void setValue(Organisation obj, LegalStructureCode value) {
			obj.setLegalStructure(value);
		}
	};
	protected Sector sector;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Organisation, com.tools20022.repository.entity.Sector> mmSector = new MMBusinessAssociationEnd<Organisation, com.tools20022.repository.entity.Sector>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Organisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Sector";
			definition = "Sector of business of the organisation, for example, pharmaceutical.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Sector.mmOrganisation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Sector.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.Sector getValue(Organisation obj) {
			return obj.getSector();
		}

		@Override
		public void setValue(Organisation obj, com.tools20022.repository.entity.Sector value) {
			obj.setSector(value);
		}
	};
	protected BuyOrSellIndicationOfInterest relatedIndicationOfInterest;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Organisation, Optional<BuyOrSellIndicationOfInterest>> mmRelatedIndicationOfInterest = new MMBusinessAssociationEnd<Organisation, Optional<BuyOrSellIndicationOfInterest>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Organisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedIndicationOfInterest";
			definition = "Indication of interest process for which a list of organisations is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> BuyOrSellIndicationOfInterest.mmOrganisations;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> BuyOrSellIndicationOfInterest.mmObject();
		}

		@Override
		public Optional<BuyOrSellIndicationOfInterest> getValue(Organisation obj) {
			return obj.getRelatedIndicationOfInterest();
		}

		@Override
		public void setValue(Organisation obj, Optional<BuyOrSellIndicationOfInterest> value) {
			obj.setRelatedIndicationOfInterest(value.orElse(null));
		}
	};
	protected OrganisationStrategy strategy;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Organisation, Optional<OrganisationStrategy>> mmStrategy = new MMBusinessAssociationEnd<Organisation, Optional<OrganisationStrategy>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Organisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Strategy";
			definition = "Strategy related to an organisation.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> OrganisationStrategy.mmOrganisation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> OrganisationStrategy.mmObject();
		}

		@Override
		public Optional<OrganisationStrategy> getValue(Organisation obj) {
			return obj.getStrategy();
		}

		@Override
		public void setValue(Organisation obj, Optional<OrganisationStrategy> value) {
			obj.setStrategy(value.orElse(null));
		}
	};
	protected OrganisationHierarchy organisationHierarchy;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Organisation, com.tools20022.repository.entity.OrganisationHierarchy> mmOrganisationHierarchy = new MMBusinessAssociationEnd<Organisation, com.tools20022.repository.entity.OrganisationHierarchy>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Organisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrganisationHierarchy";
			definition = "Description of the structure of a company.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.OrganisationHierarchy.mmOrganisation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.OrganisationHierarchy.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.OrganisationHierarchy getValue(Organisation obj) {
			return obj.getOrganisationHierarchy();
		}

		@Override
		public void setValue(Organisation obj, com.tools20022.repository.entity.OrganisationHierarchy value) {
			obj.setOrganisationHierarchy(value);
		}
	};
	protected RepresentativeOfficer representativeOfficer;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Organisation, com.tools20022.repository.entity.RepresentativeOfficer> mmRepresentativeOfficer = new MMBusinessAssociationEnd<Organisation, com.tools20022.repository.entity.RepresentativeOfficer>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Organisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RepresentativeOfficer";
			definition = "Officer who has some rights to represent a given organisation. In account management, it is the person to be contacted by the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RepresentativeOfficer.mmOrganisation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RepresentativeOfficer.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.RepresentativeOfficer getValue(Organisation obj) {
			return obj.getRepresentativeOfficer();
		}

		@Override
		public void setValue(Organisation obj, com.tools20022.repository.entity.RepresentativeOfficer value) {
			obj.setRepresentativeOfficer(value);
		}
	};
	protected ISODate establishmentDate;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<Organisation, ISODate> mmEstablishmentDate = new MMBusinessAttribute<Organisation, ISODate>() {
		{
			derivation_lazy = () -> Arrays.asList(LegalOrganisation2.mmEstablishmentDate);
			isDerived = false;
			elementContext_lazy = () -> Organisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EstablishmentDate";
			definition = "Date when the organisation was established.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(Organisation obj) {
			return obj.getEstablishmentDate();
		}

		@Override
		public void setValue(Organisation obj, ISODate value) {
			obj.setEstablishmentDate(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Organisation";
				definition = "Organised structure that is set up for a particular purpose. For example, a business, government body, department, charity, or financial institution.";
				associationDomain_lazy = () -> Arrays.asList(Organisation.mmParentOrganisation, Organisation.mmBranch, com.tools20022.repository.entity.OrganisationIdentification.mmOrganisation,
						com.tools20022.repository.entity.Location.mmOperatingOrganisation, com.tools20022.repository.entity.Location.mmRegisteredOrganisation,
						com.tools20022.repository.entity.SecuritiesModification.mmNewOrganisationInformation, com.tools20022.repository.entity.Sector.mmOrganisation, com.tools20022.repository.entity.RepresentativeOfficer.mmOrganisation,
						BuyOrSellIndicationOfInterest.mmOrganisations, OrganisationStrategy.mmOrganisation, com.tools20022.repository.entity.OrganisationHierarchy.mmOrganisation);
				derivationElement_lazy = () -> Arrays.asList(TradeParty2.mmLegalOrganisation, OriginalItemReference4.mmDebtorAgent, OriginalItemReference4.mmIntermediaryAgent, OriginalPaymentInformation7.mmDebtorAgent,
						OriginalPaymentInformation7.mmCreditorAgent);
				subType_lazy = () -> Arrays.asList(FinancialInstitution.mmObject());
				superType_lazy = () -> Party.mmObject();
				element_lazy = () -> Arrays.asList(Organisation.mmPurpose, Organisation.mmRegistrationDate, Organisation.mmOrganisationIdentification, Organisation.mmParentOrganisation, Organisation.mmBranch,
						Organisation.mmSecuritiesModification, Organisation.mmPlaceOfOperation, Organisation.mmPlaceOfRegistration, Organisation.mmDescription, Organisation.mmLegalStructure, Organisation.mmSector,
						Organisation.mmRelatedIndicationOfInterest, Organisation.mmStrategy, Organisation.mmOrganisationHierarchy, Organisation.mmRepresentativeOfficer, Organisation.mmEstablishmentDate);
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

	public Organisation setPurpose(Max35Text purpose) {
		this.purpose = Objects.requireNonNull(purpose);
		return this;
	}

	public ISODateTime getRegistrationDate() {
		return registrationDate;
	}

	public Organisation setRegistrationDate(ISODateTime registrationDate) {
		this.registrationDate = Objects.requireNonNull(registrationDate);
		return this;
	}

	public List<OrganisationIdentification> getOrganisationIdentification() {
		return organisationIdentification == null ? organisationIdentification = new ArrayList<>() : organisationIdentification;
	}

	public Organisation setOrganisationIdentification(List<com.tools20022.repository.entity.OrganisationIdentification> organisationIdentification) {
		this.organisationIdentification = Objects.requireNonNull(organisationIdentification);
		return this;
	}

	public Organisation getParentOrganisation() {
		return parentOrganisation;
	}

	public Organisation setParentOrganisation(Organisation parentOrganisation) {
		this.parentOrganisation = Objects.requireNonNull(parentOrganisation);
		return this;
	}

	public List<Organisation> getBranch() {
		return branch == null ? branch = new ArrayList<>() : branch;
	}

	public Organisation setBranch(List<Organisation> branch) {
		this.branch = Objects.requireNonNull(branch);
		return this;
	}

	public SecuritiesModification getSecuritiesModification() {
		return securitiesModification;
	}

	public Organisation setSecuritiesModification(com.tools20022.repository.entity.SecuritiesModification securitiesModification) {
		this.securitiesModification = Objects.requireNonNull(securitiesModification);
		return this;
	}

	public List<Location> getPlaceOfOperation() {
		return placeOfOperation == null ? placeOfOperation = new ArrayList<>() : placeOfOperation;
	}

	public Organisation setPlaceOfOperation(List<com.tools20022.repository.entity.Location> placeOfOperation) {
		this.placeOfOperation = Objects.requireNonNull(placeOfOperation);
		return this;
	}

	public Optional<Location> getPlaceOfRegistration() {
		return placeOfRegistration == null ? Optional.empty() : Optional.of(placeOfRegistration);
	}

	public Organisation setPlaceOfRegistration(com.tools20022.repository.entity.Location placeOfRegistration) {
		this.placeOfRegistration = placeOfRegistration;
		return this;
	}

	public Max350Text getDescription() {
		return description;
	}

	public Organisation setDescription(Max350Text description) {
		this.description = Objects.requireNonNull(description);
		return this;
	}

	public LegalStructureCode getLegalStructure() {
		return legalStructure;
	}

	public Organisation setLegalStructure(LegalStructureCode legalStructure) {
		this.legalStructure = Objects.requireNonNull(legalStructure);
		return this;
	}

	public Sector getSector() {
		return sector;
	}

	public Organisation setSector(com.tools20022.repository.entity.Sector sector) {
		this.sector = Objects.requireNonNull(sector);
		return this;
	}

	public Optional<BuyOrSellIndicationOfInterest> getRelatedIndicationOfInterest() {
		return relatedIndicationOfInterest == null ? Optional.empty() : Optional.of(relatedIndicationOfInterest);
	}

	public Organisation setRelatedIndicationOfInterest(BuyOrSellIndicationOfInterest relatedIndicationOfInterest) {
		this.relatedIndicationOfInterest = relatedIndicationOfInterest;
		return this;
	}

	public Optional<OrganisationStrategy> getStrategy() {
		return strategy == null ? Optional.empty() : Optional.of(strategy);
	}

	public Organisation setStrategy(OrganisationStrategy strategy) {
		this.strategy = strategy;
		return this;
	}

	public OrganisationHierarchy getOrganisationHierarchy() {
		return organisationHierarchy;
	}

	public Organisation setOrganisationHierarchy(com.tools20022.repository.entity.OrganisationHierarchy organisationHierarchy) {
		this.organisationHierarchy = Objects.requireNonNull(organisationHierarchy);
		return this;
	}

	public RepresentativeOfficer getRepresentativeOfficer() {
		return representativeOfficer;
	}

	public Organisation setRepresentativeOfficer(com.tools20022.repository.entity.RepresentativeOfficer representativeOfficer) {
		this.representativeOfficer = Objects.requireNonNull(representativeOfficer);
		return this;
	}

	public ISODate getEstablishmentDate() {
		return establishmentDate;
	}

	public Organisation setEstablishmentDate(ISODate establishmentDate) {
		this.establishmentDate = Objects.requireNonNull(establishmentDate);
		return this;
	}
}