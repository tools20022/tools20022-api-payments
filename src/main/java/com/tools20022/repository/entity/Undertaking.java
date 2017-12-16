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
import com.tools20022.repository.codeset.ExternalTypeOfPartyCode;
import com.tools20022.repository.codeset.ExternalUndertakingTypeCode;
import com.tools20022.repository.codeset.UndertakingNameCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Independent undertaking, such as a demand guarantee or standby letter of
 * credit, that provides financial assurance, to be collected on the
 * presentation of documents that comply with its terms and conditions.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Undertaking" src="doc-files/Undertaking.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#mmElectronicSignature
 * Undertaking.mmElectronicSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#mmUndertakingStatus
 * Undertaking.mmUndertakingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#mmIdentification
 * Undertaking.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Undertaking#mmDemand
 * Undertaking.mmDemand}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#mmTerminationDate
 * Undertaking.mmTerminationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#mmUndertakingAmount
 * Undertaking.mmUndertakingAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Undertaking#mmExpiry
 * Undertaking.mmExpiry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Undertaking#mmPartyRole
 * Undertaking.mmPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#mmUndertakingAmendment
 * Undertaking.mmUndertakingAmendment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#mmSpecifiedDocument
 * Undertaking.mmSpecifiedDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Undertaking#mmDateOfAdvice
 * Undertaking.mmDateOfAdvice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Undertaking#mmPurpose
 * Undertaking.mmPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#mmUndertakingName
 * Undertaking.mmUndertakingName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Undertaking#mmType
 * Undertaking.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#mmConfirmationIndicator
 * Undertaking.mmConfirmationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#mmCounterUndertakingIndicator
 * Undertaking.mmCounterUndertakingIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#mmRelatedChargesPayableBy
 * Undertaking.mmRelatedChargesPayableBy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#mmStandardClaimDocumentIndicator
 * Undertaking.mmStandardClaimDocumentIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#mmUnderlyingTransaction
 * Undertaking.mmUnderlyingTransaction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Undertaking#mmModelForm
 * Undertaking.mmModelForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#mmMultipleDemandIndicator
 * Undertaking.mmMultipleDemandIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#mmPartialDemandIndicator
 * Undertaking.mmPartialDemandIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#mmTransferIndicator
 * Undertaking.mmTransferIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#mmPredefinedVariation
 * Undertaking.mmPredefinedVariation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Undertaking#mmCharges
 * Undertaking.mmCharges}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Undertaking#mmPresentation
 * Undertaking.mmPresentation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#mmUndertakingExtension
 * Undertaking.mmUndertakingExtension}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Charges#mmRelatedUndertaking
 * Charges.mmRelatedUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ElectronicSignature#mmUndertaking
 * ElectronicSignature.mmUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Presentation#mmPresentedUndertaking
 * Presentation.mmPresentedUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingStatus#mmUndertaking
 * UndertakingStatus.mmUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingPartyRole#mmUndertaking
 * UndertakingPartyRole.mmUndertaking}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Demand#mmUndertaking
 * Demand.mmUndertaking}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Expiry#mmUndertaking
 * Expiry.mmUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingDocument#mmUndertaking
 * UndertakingDocument.mmUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AmendmentOfUndertaking#mmUndertaking
 * AmendmentOfUndertaking.mmUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingAmount#mmUndertaking
 * UndertakingAmount.mmUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingExtension#mmUndertaking
 * UndertakingExtension.mmUndertaking}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ModelForm#mmUndertaking
 * ModelForm.mmUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UnderlyingTransaction#mmUndertaking
 * UnderlyingTransaction.mmUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AutomaticVariation#mmUndertaking
 * AutomaticVariation.mmUndertaking}</li>
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
 * "Undertaking"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Independent undertaking, such as a demand guarantee or standby letter of credit, that provides financial assurance, to be collected on the presentation of documents that comply with its terms and conditions."
 * </li>
 * </ul>
 */
public class Undertaking {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ElectronicSignature electronicSignature;
	/**
	 * Digital signature.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicSignature#mmUndertaking
	 * ElectronicSignature.mmUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ElectronicSignature
	 * ElectronicSignature}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectronicSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Digital signature."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmElectronicSignature = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ElectronicSignature";
			definition = "Digital signature.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ElectronicSignature.mmUndertaking;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ElectronicSignature.mmObject();
		}
	};
	protected UndertakingStatus undertakingStatus;
	/**
	 * Status of the undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingStatus#mmUndertaking
	 * UndertakingStatus.mmUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.UndertakingStatus
	 * UndertakingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the undertaking."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmUndertakingStatus = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UndertakingStatus";
			definition = "Status of the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.UndertakingStatus.mmUndertaking;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.UndertakingStatus.mmObject();
		}
	};
	protected Max35Text identification;
	/**
	 * Unique and unambiguous identifier assigned to the undertaking issued by
	 * the guarantor/issuer. This reference is used throughout the life cycle of
	 * the undertaking.
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
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier assigned to the undertaking issued by the guarantor/issuer. This reference is used throughout the life cycle of the undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identifier assigned to the undertaking issued by the guarantor/issuer. This reference is used throughout the life cycle of the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Undertaking.class.getMethod("getIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Demand demand;
	/**
	 * Document signed by the beneficiary demanding payment under a demand
	 * guarantee or standby letter of credit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Demand#mmUndertaking
	 * Demand.mmUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Demand Demand}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Demand"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Document signed by the beneficiary demanding payment under a demand guarantee or standby letter of credit."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDemand = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Demand";
			definition = "Document signed by the beneficiary demanding payment under a demand guarantee or standby letter of credit.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Demand.mmUndertaking;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Demand.mmObject();
		}
	};
	protected ISODate terminationDate;
	/**
	 * Date when the undertaking terminates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date when the undertaking terminates."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTerminationDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TerminationDate";
			definition = "Date when the undertaking terminates.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Undertaking.class.getMethod("getTerminationDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected UndertakingAmount undertakingAmount;
	/**
	 * Amount of the undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingAmount#mmUndertaking
	 * UndertakingAmount.mmUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.UndertakingAmount
	 * UndertakingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of the undertaking."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmUndertakingAmount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UndertakingAmount";
			definition = "Amount of the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.UndertakingAmount.mmUndertaking;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.UndertakingAmount.mmObject();
		}
	};
	protected Expiry expiry;
	/**
	 * Expiry information about the undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Expiry#mmUndertaking
	 * Expiry.mmUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Expiry Expiry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Expiry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Expiry information about the undertaking."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmExpiry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Expiry";
			definition = "Expiry information about the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Expiry.mmUndertaking;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Expiry.mmObject();
		}
	};
	protected UndertakingPartyRole partyRole;
	/**
	 * Role played by a party in the context of an undertaking or in the context
	 * of the business linked to the undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingPartyRole#mmUndertaking
	 * UndertakingPartyRole.mmUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingPartyRole
	 * UndertakingPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Role played by a party in the context of an undertaking or in the context of the business linked to the undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Role played by a party in the context of an undertaking or in the context of the business linked to the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.UndertakingPartyRole.mmUndertaking;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.UndertakingPartyRole.mmObject();
		}
	};
	protected AmendmentOfUndertaking undertakingAmendment;
	/**
	 * Modification of an undertaking such as an guarantee or standby letter of
	 * credit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AmendmentOfUndertaking#mmUndertaking
	 * AmendmentOfUndertaking.mmUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.AmendmentOfUndertaking
	 * AmendmentOfUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingAmendment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Modification of an undertaking such as an guarantee or standby letter of credit."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmUndertakingAmendment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UndertakingAmendment";
			definition = "Modification of an undertaking such as an guarantee or standby letter of credit.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AmendmentOfUndertaking.mmUndertaking;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AmendmentOfUndertaking.mmObject();
		}
	};
	protected UndertakingDocument specifiedDocument;
	/**
	 * Document related to the undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingDocument#mmUndertaking
	 * UndertakingDocument.mmUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.UndertakingDocument
	 * UndertakingDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecifiedDocument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Document related to the undertaking."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSpecifiedDocument = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpecifiedDocument";
			definition = "Document related to the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.UndertakingDocument.mmUndertaking;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.UndertakingDocument.mmObject();
		}
	};
	protected ISODateTime dateOfAdvice;
	/**
	 * Date on which the undertaking or its amendment is advised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateOfAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the undertaking or its amendment is advised."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDateOfAdvice = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DateOfAdvice";
			definition = "Date on which the undertaking or its amendment is advised.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Undertaking.class.getMethod("getDateOfAdvice", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text purpose;
	/**
	 * Description of the purpose of the undertaking.
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
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Purpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Description of the purpose of the undertaking."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPurpose = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Purpose";
			definition = "Description of the purpose of the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Undertaking.class.getMethod("getPurpose", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected UndertakingNameCode undertakingName;
	/**
	 * Name of undertaking such as, demand guarantee, standby letter of credit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UndertakingNameCode
	 * UndertakingNameCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of undertaking such as, demand guarantee, standby letter of credit."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmUndertakingName = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UndertakingName";
			definition = "Name of undertaking such as, demand guarantee, standby letter of credit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UndertakingNameCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Undertaking.class.getMethod("getUndertakingName", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ExternalUndertakingTypeCode type;
	/**
	 * Type of guarantee or standby letter of credit, for example, performance,
	 * payment, etc.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalUndertakingTypeCode
	 * ExternalUndertakingTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of guarantee or standby letter of credit, for example, performance,  payment, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type of guarantee or standby letter of credit, for example, performance,  payment, etc.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalUndertakingTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Undertaking.class.getMethod("getType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator confirmationIndicator;
	/**
	 * Indicates whether the advising bank (confirmer) is requested to add its
	 * confirmation to the undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the advising bank (confirmer) is requested to add its confirmation to the undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmConfirmationIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConfirmationIndicator";
			definition = "Indicates whether the advising bank (confirmer) is requested to add its confirmation to the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Undertaking.class.getMethod("getConfirmationIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator counterUndertakingIndicator;
	/**
	 * Indicates whether the undertaking is a counter-undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterUndertakingIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the undertaking is a counter-undertaking."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCounterUndertakingIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CounterUndertakingIndicator";
			definition = "Indicates whether the undertaking is a counter-undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Undertaking.class.getMethod("getCounterUndertakingIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ExternalTypeOfPartyCode relatedChargesPayableBy;
	/**
	 * Indicates whether the applicant/obligor or beneficiary is responsible for
	 * payment of the charges.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalTypeOfPartyCode
	 * ExternalTypeOfPartyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedChargesPayableBy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the applicant/obligor or beneficiary is responsible for payment of the charges."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRelatedChargesPayableBy = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedChargesPayableBy";
			definition = "Indicates whether the applicant/obligor or beneficiary is responsible for payment of the charges.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalTypeOfPartyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Undertaking.class.getMethod("getRelatedChargesPayableBy", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator standardClaimDocumentIndicator;
	/**
	 * Indication as to whether a claim is to utilise a standard claim form of
	 * the issuing institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandardClaimDocumentIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indication as to whether a claim is to utilise a standard claim form of the issuing institution."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmStandardClaimDocumentIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StandardClaimDocumentIndicator";
			definition = "Indication as to whether a claim is to utilise a standard claim form of the issuing institution.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Undertaking.class.getMethod("getStandardClaimDocumentIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected UnderlyingTransaction underlyingTransaction;
	/**
	 * Reference information on a commercial obligation between the beneficiary
	 * and applicant for which an undertaking is issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UnderlyingTransaction#mmUndertaking
	 * UnderlyingTransaction.mmUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.UnderlyingTransaction
	 * UnderlyingTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference information on a commercial obligation between the beneficiary and applicant for which an undertaking is issued."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmUnderlyingTransaction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnderlyingTransaction";
			definition = "Reference information on a commercial obligation between the beneficiary and applicant for which an undertaking is issued.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.UnderlyingTransaction.mmUndertaking;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.UnderlyingTransaction.mmObject();
		}
	};
	protected ModelForm modelForm;
	/**
	 * Wording template for the undertaking content made available for use with
	 * certain governance rules or made available by particular institutions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ModelForm#mmUndertaking
	 * ModelForm.mmUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ModelForm ModelForm}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModelForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Wording template for the undertaking content made available for use with certain governance rules or made available by particular institutions. "
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmModelForm = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ModelForm";
			definition = "Wording template for the undertaking content made available for use with certain governance rules or made available by particular institutions. ";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ModelForm.mmUndertaking;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ModelForm.mmObject();
		}
	};
	protected YesNoIndicator multipleDemandIndicator;
	/**
	 * Indicates whether multiple demands are permitted against the undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultipleDemandIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether multiple demands are permitted against the undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMultipleDemandIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MultipleDemandIndicator";
			definition = "Indicates whether multiple demands are permitted against the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Undertaking.class.getMethod("getMultipleDemandIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator partialDemandIndicator;
	/**
	 * Indicates whether partial demands/drawings are permitted against the
	 * undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialDemandIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether partial demands/drawings are permitted against the undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPartialDemandIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartialDemandIndicator";
			definition = "Indicates whether partial demands/drawings are permitted against the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Undertaking.class.getMethod("getPartialDemandIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator transferIndicator;
	/**
	 * Indicates whether the undertaking is transferrable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the undertaking is transferrable."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTransferIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransferIndicator";
			definition = "Indicates whether the undertaking is transferrable.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Undertaking.class.getMethod("getTransferIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AutomaticVariation predefinedVariation;
	/**
	 * Changes that may be made to the undertaking covered by clauses in the
	 * existing undertaking and its amendments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AutomaticVariation#mmUndertaking
	 * AutomaticVariation.mmUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AutomaticVariation
	 * AutomaticVariation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PredefinedVariation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Changes that may be made to the undertaking covered by clauses in the existing undertaking and its amendments."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPredefinedVariation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PredefinedVariation";
			definition = "Changes that may be made to the undertaking covered by clauses in the existing undertaking and its amendments.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AutomaticVariation.mmUndertaking;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AutomaticVariation.mmObject();
		}
	};
	protected Charges charges;
	/**
	 * Amount and currency of the commissions and changes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Charges#mmRelatedUndertaking
	 * Charges.mmRelatedUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Charges Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Charges"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount and currency of the commissions and changes."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCharges = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Charges";
			definition = "Amount and currency of the commissions and changes.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Charges.mmRelatedUndertaking;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
		}
	};
	protected Presentation presentation;
	/**
	 * Presentation information related to the undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Presentation#mmPresentedUndertaking
	 * Presentation.mmPresentedUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Presentation
	 * Presentation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Presentation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Presentation information related to the undertaking."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPresentation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Presentation";
			definition = "Presentation information related to the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Presentation.mmPresentedUndertaking;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Presentation.mmObject();
		}
	};
	protected UndertakingExtension undertakingExtension;
	/**
	 * Specifies information related to the extension of an undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingExtension#mmUndertaking
	 * UndertakingExtension.mmUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingExtension
	 * UndertakingExtension}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingExtension"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies information related to the extension of an undertaking."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmUndertakingExtension = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UndertakingExtension";
			definition = "Specifies information related to the extension of an undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.UndertakingExtension.mmUndertaking;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.UndertakingExtension.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Undertaking";
				definition = "Independent undertaking, such as a demand guarantee or standby letter of credit, that provides financial assurance, to be collected on the presentation of documents that comply with its terms and conditions.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Charges.mmRelatedUndertaking, com.tools20022.repository.entity.ElectronicSignature.mmUndertaking,
						com.tools20022.repository.entity.Presentation.mmPresentedUndertaking, com.tools20022.repository.entity.UndertakingStatus.mmUndertaking, com.tools20022.repository.entity.UndertakingPartyRole.mmUndertaking,
						com.tools20022.repository.entity.Demand.mmUndertaking, com.tools20022.repository.entity.Expiry.mmUndertaking, com.tools20022.repository.entity.UndertakingDocument.mmUndertaking,
						com.tools20022.repository.entity.AmendmentOfUndertaking.mmUndertaking, com.tools20022.repository.entity.UndertakingAmount.mmUndertaking, com.tools20022.repository.entity.UndertakingExtension.mmUndertaking,
						com.tools20022.repository.entity.ModelForm.mmUndertaking, com.tools20022.repository.entity.UnderlyingTransaction.mmUndertaking, com.tools20022.repository.entity.AutomaticVariation.mmUndertaking);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Undertaking.mmElectronicSignature, com.tools20022.repository.entity.Undertaking.mmUndertakingStatus,
						com.tools20022.repository.entity.Undertaking.mmIdentification, com.tools20022.repository.entity.Undertaking.mmDemand, com.tools20022.repository.entity.Undertaking.mmTerminationDate,
						com.tools20022.repository.entity.Undertaking.mmUndertakingAmount, com.tools20022.repository.entity.Undertaking.mmExpiry, com.tools20022.repository.entity.Undertaking.mmPartyRole,
						com.tools20022.repository.entity.Undertaking.mmUndertakingAmendment, com.tools20022.repository.entity.Undertaking.mmSpecifiedDocument, com.tools20022.repository.entity.Undertaking.mmDateOfAdvice,
						com.tools20022.repository.entity.Undertaking.mmPurpose, com.tools20022.repository.entity.Undertaking.mmUndertakingName, com.tools20022.repository.entity.Undertaking.mmType,
						com.tools20022.repository.entity.Undertaking.mmConfirmationIndicator, com.tools20022.repository.entity.Undertaking.mmCounterUndertakingIndicator,
						com.tools20022.repository.entity.Undertaking.mmRelatedChargesPayableBy, com.tools20022.repository.entity.Undertaking.mmStandardClaimDocumentIndicator,
						com.tools20022.repository.entity.Undertaking.mmUnderlyingTransaction, com.tools20022.repository.entity.Undertaking.mmModelForm, com.tools20022.repository.entity.Undertaking.mmMultipleDemandIndicator,
						com.tools20022.repository.entity.Undertaking.mmPartialDemandIndicator, com.tools20022.repository.entity.Undertaking.mmTransferIndicator, com.tools20022.repository.entity.Undertaking.mmPredefinedVariation,
						com.tools20022.repository.entity.Undertaking.mmCharges, com.tools20022.repository.entity.Undertaking.mmPresentation, com.tools20022.repository.entity.Undertaking.mmUndertakingExtension);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Undertaking.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ElectronicSignature getElectronicSignature() {
		return electronicSignature;
	}

	public void setElectronicSignature(com.tools20022.repository.entity.ElectronicSignature electronicSignature) {
		this.electronicSignature = electronicSignature;
	}

	public UndertakingStatus getUndertakingStatus() {
		return undertakingStatus;
	}

	public void setUndertakingStatus(com.tools20022.repository.entity.UndertakingStatus undertakingStatus) {
		this.undertakingStatus = undertakingStatus;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}

	public Demand getDemand() {
		return demand;
	}

	public void setDemand(com.tools20022.repository.entity.Demand demand) {
		this.demand = demand;
	}

	public ISODate getTerminationDate() {
		return terminationDate;
	}

	public void setTerminationDate(ISODate terminationDate) {
		this.terminationDate = terminationDate;
	}

	public UndertakingAmount getUndertakingAmount() {
		return undertakingAmount;
	}

	public void setUndertakingAmount(com.tools20022.repository.entity.UndertakingAmount undertakingAmount) {
		this.undertakingAmount = undertakingAmount;
	}

	public Expiry getExpiry() {
		return expiry;
	}

	public void setExpiry(com.tools20022.repository.entity.Expiry expiry) {
		this.expiry = expiry;
	}

	public UndertakingPartyRole getPartyRole() {
		return partyRole;
	}

	public void setPartyRole(com.tools20022.repository.entity.UndertakingPartyRole partyRole) {
		this.partyRole = partyRole;
	}

	public AmendmentOfUndertaking getUndertakingAmendment() {
		return undertakingAmendment;
	}

	public void setUndertakingAmendment(com.tools20022.repository.entity.AmendmentOfUndertaking undertakingAmendment) {
		this.undertakingAmendment = undertakingAmendment;
	}

	public UndertakingDocument getSpecifiedDocument() {
		return specifiedDocument;
	}

	public void setSpecifiedDocument(com.tools20022.repository.entity.UndertakingDocument specifiedDocument) {
		this.specifiedDocument = specifiedDocument;
	}

	public ISODateTime getDateOfAdvice() {
		return dateOfAdvice;
	}

	public void setDateOfAdvice(ISODateTime dateOfAdvice) {
		this.dateOfAdvice = dateOfAdvice;
	}

	public Max35Text getPurpose() {
		return purpose;
	}

	public void setPurpose(Max35Text purpose) {
		this.purpose = purpose;
	}

	public UndertakingNameCode getUndertakingName() {
		return undertakingName;
	}

	public void setUndertakingName(UndertakingNameCode undertakingName) {
		this.undertakingName = undertakingName;
	}

	public ExternalUndertakingTypeCode getType() {
		return type;
	}

	public void setType(ExternalUndertakingTypeCode type) {
		this.type = type;
	}

	public YesNoIndicator getConfirmationIndicator() {
		return confirmationIndicator;
	}

	public void setConfirmationIndicator(YesNoIndicator confirmationIndicator) {
		this.confirmationIndicator = confirmationIndicator;
	}

	public YesNoIndicator getCounterUndertakingIndicator() {
		return counterUndertakingIndicator;
	}

	public void setCounterUndertakingIndicator(YesNoIndicator counterUndertakingIndicator) {
		this.counterUndertakingIndicator = counterUndertakingIndicator;
	}

	public ExternalTypeOfPartyCode getRelatedChargesPayableBy() {
		return relatedChargesPayableBy;
	}

	public void setRelatedChargesPayableBy(ExternalTypeOfPartyCode relatedChargesPayableBy) {
		this.relatedChargesPayableBy = relatedChargesPayableBy;
	}

	public YesNoIndicator getStandardClaimDocumentIndicator() {
		return standardClaimDocumentIndicator;
	}

	public void setStandardClaimDocumentIndicator(YesNoIndicator standardClaimDocumentIndicator) {
		this.standardClaimDocumentIndicator = standardClaimDocumentIndicator;
	}

	public UnderlyingTransaction getUnderlyingTransaction() {
		return underlyingTransaction;
	}

	public void setUnderlyingTransaction(com.tools20022.repository.entity.UnderlyingTransaction underlyingTransaction) {
		this.underlyingTransaction = underlyingTransaction;
	}

	public ModelForm getModelForm() {
		return modelForm;
	}

	public void setModelForm(com.tools20022.repository.entity.ModelForm modelForm) {
		this.modelForm = modelForm;
	}

	public YesNoIndicator getMultipleDemandIndicator() {
		return multipleDemandIndicator;
	}

	public void setMultipleDemandIndicator(YesNoIndicator multipleDemandIndicator) {
		this.multipleDemandIndicator = multipleDemandIndicator;
	}

	public YesNoIndicator getPartialDemandIndicator() {
		return partialDemandIndicator;
	}

	public void setPartialDemandIndicator(YesNoIndicator partialDemandIndicator) {
		this.partialDemandIndicator = partialDemandIndicator;
	}

	public YesNoIndicator getTransferIndicator() {
		return transferIndicator;
	}

	public void setTransferIndicator(YesNoIndicator transferIndicator) {
		this.transferIndicator = transferIndicator;
	}

	public AutomaticVariation getPredefinedVariation() {
		return predefinedVariation;
	}

	public void setPredefinedVariation(com.tools20022.repository.entity.AutomaticVariation predefinedVariation) {
		this.predefinedVariation = predefinedVariation;
	}

	public Charges getCharges() {
		return charges;
	}

	public void setCharges(com.tools20022.repository.entity.Charges charges) {
		this.charges = charges;
	}

	public Presentation getPresentation() {
		return presentation;
	}

	public void setPresentation(com.tools20022.repository.entity.Presentation presentation) {
		this.presentation = presentation;
	}

	public UndertakingExtension getUndertakingExtension() {
		return undertakingExtension;
	}

	public void setUndertakingExtension(com.tools20022.repository.entity.UndertakingExtension undertakingExtension) {
		this.undertakingExtension = undertakingExtension;
	}
}