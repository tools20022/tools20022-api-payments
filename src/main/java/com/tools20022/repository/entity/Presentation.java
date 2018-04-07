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
import com.tools20022.repository.choice.Channel2Choice;
import com.tools20022.repository.codeset.CommunicationMethodCode;
import com.tools20022.repository.codeset.ExternalChannelCode;
import com.tools20022.repository.codeset.PresentationMediumCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.Document;
import com.tools20022.repository.entity.ElectronicAddress;
import com.tools20022.repository.entity.Undertaking;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.RegisteredContractCommunication1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Presentation of documents.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Presentation" src="doc-files/Presentation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Presentation#mmCommunicationMethod
 * Presentation.mmCommunicationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Presentation#mmPresentedUndertaking
 * Presentation.mmPresentedUndertaking}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Presentation#mmMedium
 * Presentation.mmMedium}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Presentation#mmPresentedDocument
 * Presentation.mmPresentedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Presentation#mmElectronicPresentationAddress
 * Presentation.mmElectronicPresentationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Presentation#mmPresentationDate
 * Presentation.mmPresentationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Presentation#mmApplicableChannel
 * Presentation.mmApplicableChannel}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ElectronicAddress#mmRelatedPresentation
 * ElectronicAddress.mmRelatedPresentation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmPresentation
 * Document.mmPresentation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Undertaking#mmPresentation
 * Undertaking.mmPresentation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContractCommunication1
 * RegisteredContractCommunication1}</li>
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
 * "Presentation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Presentation of documents."</li>
 * </ul>
 */
public class Presentation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ExternalChannelCode communicationMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalChannelCode
	 * ExternalChannelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.choice.Channel2Choice#mmCode
	 * Channel2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Channel2Choice#mmProprietary
	 * Channel2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContractCommunication1#mmMethod
	 * RegisteredContractCommunication1.mmMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Presentation Presentation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommunicationMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Method by which the document is to be delivered."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Presentation, ExternalChannelCode> mmCommunicationMethod = new MMBusinessAttribute<Presentation, ExternalChannelCode>() {
		{
			derivation_lazy = () -> Arrays.asList(Channel2Choice.mmCode, Channel2Choice.mmProprietary, RegisteredContractCommunication1.mmMethod);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Presentation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CommunicationMethod";
			definition = "Method by which the document is to be delivered.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalChannelCode.mmObject();
		}

		@Override
		public ExternalChannelCode getValue(Presentation obj) {
			return obj.getCommunicationMethod();
		}

		@Override
		public void setValue(Presentation obj, ExternalChannelCode value) {
			obj.setCommunicationMethod(value);
		}
	};
	protected Undertaking presentedUndertaking;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmPresentation
	 * Undertaking.mmPresentation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Undertaking
	 * Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Presentation Presentation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PresentedUndertaking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the undertaking which is presented and its associated documents."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Presentation, Undertaking> mmPresentedUndertaking = new MMBusinessAssociationEnd<Presentation, Undertaking>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Presentation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PresentedUndertaking";
			definition = "Specifies the undertaking which is presented and its associated documents.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Undertaking.mmPresentation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Undertaking.mmObject();
		}

		@Override
		public Undertaking getValue(Presentation obj) {
			return obj.getPresentedUndertaking();
		}

		@Override
		public void setValue(Presentation obj, Undertaking value) {
			obj.setPresentedUndertaking(value);
		}
	};
	protected PresentationMediumCode medium;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PresentationMediumCode
	 * PresentationMediumCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Presentation Presentation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Medium"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Medium through which the presentation can be submitted such as paper, electronic or both."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Presentation, PresentationMediumCode> mmMedium = new MMBusinessAttribute<Presentation, PresentationMediumCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Presentation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Medium";
			definition = "Medium through which the presentation can be submitted such as paper, electronic or both.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PresentationMediumCode.mmObject();
		}

		@Override
		public PresentationMediumCode getValue(Presentation obj) {
			return obj.getMedium();
		}

		@Override
		public void setValue(Presentation obj, PresentationMediumCode value) {
			obj.setMedium(value);
		}
	};
	protected List<Document> presentedDocument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmPresentation
	 * Document.mmPresentation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Presentation Presentation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PresentedDocument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Documents which are presented."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Presentation, List<Document>> mmPresentedDocument = new MMBusinessAssociationEnd<Presentation, List<Document>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Presentation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PresentedDocument";
			definition = "Documents which are presented.";
			minOccurs = 1;
			opposite_lazy = () -> Document.mmPresentation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Document.mmObject();
		}

		@Override
		public List<Document> getValue(Presentation obj) {
			return obj.getPresentedDocument();
		}

		@Override
		public void setValue(Presentation obj, List<Document> value) {
			obj.setPresentedDocument(value);
		}
	};
	protected ElectronicAddress electronicPresentationAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicAddress#mmRelatedPresentation
	 * ElectronicAddress.mmRelatedPresentation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ElectronicAddress
	 * ElectronicAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Presentation Presentation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectronicPresentationAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Electronic address for the presentation of documents."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Presentation, Optional<ElectronicAddress>> mmElectronicPresentationAddress = new MMBusinessAssociationEnd<Presentation, Optional<ElectronicAddress>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Presentation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ElectronicPresentationAddress";
			definition = "Electronic address for the presentation of documents.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> ElectronicAddress.mmRelatedPresentation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ElectronicAddress.mmObject();
		}

		@Override
		public Optional<ElectronicAddress> getValue(Presentation obj) {
			return obj.getElectronicPresentationAddress();
		}

		@Override
		public void setValue(Presentation obj, Optional<ElectronicAddress> value) {
			obj.setElectronicPresentationAddress(value.orElse(null));
		}
	};
	protected ISODate presentationDate;
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
	 * {@linkplain com.tools20022.repository.msg.RegisteredContractCommunication1#mmDate
	 * RegisteredContractCommunication1.mmDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Presentation Presentation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PresentationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the presentation is made."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Presentation, ISODate> mmPresentationDate = new MMBusinessAttribute<Presentation, ISODate>() {
		{
			derivation_lazy = () -> Arrays.asList(RegisteredContractCommunication1.mmDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Presentation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PresentationDate";
			definition = "Date on which the presentation is made.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(Presentation obj) {
			return obj.getPresentationDate();
		}

		@Override
		public void setValue(Presentation obj, ISODate value) {
			obj.setPresentationDate(value);
		}
	};
	protected CommunicationMethodCode applicableChannel;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CommunicationMethodCode
	 * CommunicationMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Presentation Presentation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicableChannel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Channel used for the transmission of a document."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Presentation, CommunicationMethodCode> mmApplicableChannel = new MMBusinessAttribute<Presentation, CommunicationMethodCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Presentation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ApplicableChannel";
			definition = "Channel used for the transmission of a document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CommunicationMethodCode.mmObject();
		}

		@Override
		public CommunicationMethodCode getValue(Presentation obj) {
			return obj.getApplicableChannel();
		}

		@Override
		public void setValue(Presentation obj, CommunicationMethodCode value) {
			obj.setApplicableChannel(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Presentation";
				definition = "Presentation of documents.";
				associationDomain_lazy = () -> Arrays.asList(ElectronicAddress.mmRelatedPresentation, Document.mmPresentation, Undertaking.mmPresentation);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Presentation.mmCommunicationMethod, com.tools20022.repository.entity.Presentation.mmPresentedUndertaking,
						com.tools20022.repository.entity.Presentation.mmMedium, com.tools20022.repository.entity.Presentation.mmPresentedDocument, com.tools20022.repository.entity.Presentation.mmElectronicPresentationAddress,
						com.tools20022.repository.entity.Presentation.mmPresentationDate, com.tools20022.repository.entity.Presentation.mmApplicableChannel);
				derivationComponent_lazy = () -> Arrays.asList(RegisteredContractCommunication1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Presentation.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ExternalChannelCode getCommunicationMethod() {
		return communicationMethod;
	}

	public Presentation setCommunicationMethod(ExternalChannelCode communicationMethod) {
		this.communicationMethod = Objects.requireNonNull(communicationMethod);
		return this;
	}

	public Undertaking getPresentedUndertaking() {
		return presentedUndertaking;
	}

	public Presentation setPresentedUndertaking(Undertaking presentedUndertaking) {
		this.presentedUndertaking = Objects.requireNonNull(presentedUndertaking);
		return this;
	}

	public PresentationMediumCode getMedium() {
		return medium;
	}

	public Presentation setMedium(PresentationMediumCode medium) {
		this.medium = Objects.requireNonNull(medium);
		return this;
	}

	public List<Document> getPresentedDocument() {
		return presentedDocument == null ? presentedDocument = new ArrayList<>() : presentedDocument;
	}

	public Presentation setPresentedDocument(List<Document> presentedDocument) {
		this.presentedDocument = Objects.requireNonNull(presentedDocument);
		return this;
	}

	public Optional<ElectronicAddress> getElectronicPresentationAddress() {
		return electronicPresentationAddress == null ? Optional.empty() : Optional.of(electronicPresentationAddress);
	}

	public Presentation setElectronicPresentationAddress(ElectronicAddress electronicPresentationAddress) {
		this.electronicPresentationAddress = electronicPresentationAddress;
		return this;
	}

	public ISODate getPresentationDate() {
		return presentationDate;
	}

	public Presentation setPresentationDate(ISODate presentationDate) {
		this.presentationDate = Objects.requireNonNull(presentationDate);
		return this;
	}

	public CommunicationMethodCode getApplicableChannel() {
		return applicableChannel;
	}

	public Presentation setApplicableChannel(CommunicationMethodCode applicableChannel) {
		this.applicableChannel = Objects.requireNonNull(applicableChannel);
		return this;
	}
}