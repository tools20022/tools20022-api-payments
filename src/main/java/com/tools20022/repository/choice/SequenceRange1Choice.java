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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SequenceRange1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies a choice of sequences.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SequenceRange1Choice#mmFromSequence
 * SequenceRange1Choice.mmFromSequence}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SequenceRange1Choice#mmToSequence
 * SequenceRange1Choice.mmToSequence}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SequenceRange1Choice#mmFromToSequence
 * SequenceRange1Choice.mmFromToSequence}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SequenceRange1Choice#mmEqualSequence
 * SequenceRange1Choice.mmEqualSequence}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SequenceRange1Choice#mmNotEqualSequence
 * SequenceRange1Choice.mmNotEqualSequence}</li>
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
 * "SequenceRange1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies a choice of sequences."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SequenceRange1Choice", propOrder = {"fromSequence", "toSequence", "fromToSequence", "equalSequence", "notEqualSequence"})
public class SequenceRange1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FrSeq", required = true)
	protected Max35Text fromSequence;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SequenceRange1Choice
	 * SequenceRange1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrSeq"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FromSequence"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Start sequence of the range."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SequenceRange1Choice, Max35Text> mmFromSequence = new MMMessageAttribute<SequenceRange1Choice, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.SequenceRange1Choice.mmObject();
			isDerived = false;
			xmlTag = "FrSeq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FromSequence";
			definition = "Start sequence of the range.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(SequenceRange1Choice obj) {
			return obj.getFromSequence();
		}

		@Override
		public void setValue(SequenceRange1Choice obj, Max35Text value) {
			obj.setFromSequence(value);
		}
	};
	@XmlElement(name = "ToSeq", required = true)
	protected Max35Text toSequence;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SequenceRange1Choice
	 * SequenceRange1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ToSeq"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToSequence"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "End sequence of the range."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SequenceRange1Choice, Max35Text> mmToSequence = new MMMessageAttribute<SequenceRange1Choice, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.SequenceRange1Choice.mmObject();
			isDerived = false;
			xmlTag = "ToSeq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ToSequence";
			definition = "End sequence of the range.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(SequenceRange1Choice obj) {
			return obj.getToSequence();
		}

		@Override
		public void setValue(SequenceRange1Choice obj, Max35Text value) {
			obj.setToSequence(value);
		}
	};
	@XmlElement(name = "FrToSeq", required = true)
	protected List<SequenceRange1> fromToSequence;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SequenceRange1
	 * SequenceRange1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SequenceRange1Choice
	 * SequenceRange1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrToSeq"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FromToSequence"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Particular sequence range specified between a start sequence and an end sequence."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SequenceRange1Choice, List<SequenceRange1>> mmFromToSequence = new MMMessageAssociationEnd<SequenceRange1Choice, List<SequenceRange1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.SequenceRange1Choice.mmObject();
			isDerived = false;
			xmlTag = "FrToSeq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FromToSequence";
			definition = "Particular sequence range specified between a start sequence and an end sequence.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SequenceRange1.mmObject();
		}

		@Override
		public List<SequenceRange1> getValue(SequenceRange1Choice obj) {
			return obj.getFromToSequence();
		}

		@Override
		public void setValue(SequenceRange1Choice obj, List<SequenceRange1> value) {
			obj.setFromToSequence(value);
		}
	};
	@XmlElement(name = "EQSeq", required = true)
	protected List<Max35Text> equalSequence;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SequenceRange1Choice
	 * SequenceRange1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EQSeq"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EqualSequence"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specified sequence to match."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SequenceRange1Choice, List<Max35Text>> mmEqualSequence = new MMMessageAttribute<SequenceRange1Choice, List<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.SequenceRange1Choice.mmObject();
			isDerived = false;
			xmlTag = "EQSeq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EqualSequence";
			definition = "Specified sequence to match.";
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(SequenceRange1Choice obj) {
			return obj.getEqualSequence();
		}

		@Override
		public void setValue(SequenceRange1Choice obj, List<Max35Text> value) {
			obj.setEqualSequence(value);
		}
	};
	@XmlElement(name = "NEQSeq", required = true)
	protected List<Max35Text> notEqualSequence;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SequenceRange1Choice
	 * SequenceRange1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NEQSeq"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotEqualSequence"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specified sequence to be excluded."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SequenceRange1Choice, List<Max35Text>> mmNotEqualSequence = new MMMessageAttribute<SequenceRange1Choice, List<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.SequenceRange1Choice.mmObject();
			isDerived = false;
			xmlTag = "NEQSeq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotEqualSequence";
			definition = "Specified sequence to be excluded.";
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(SequenceRange1Choice obj) {
			return obj.getNotEqualSequence();
		}

		@Override
		public void setValue(SequenceRange1Choice obj, List<Max35Text> value) {
			obj.setNotEqualSequence(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays
						.asList(com.tools20022.repository.choice.SequenceRange1Choice.mmFromSequence, com.tools20022.repository.choice.SequenceRange1Choice.mmToSequence,
								com.tools20022.repository.choice.SequenceRange1Choice.mmFromToSequence, com.tools20022.repository.choice.SequenceRange1Choice.mmEqualSequence,
								com.tools20022.repository.choice.SequenceRange1Choice.mmNotEqualSequence);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SequenceRange1Choice";
				definition = "Specifies a choice of sequences.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getFromSequence() {
		return fromSequence;
	}

	public SequenceRange1Choice setFromSequence(Max35Text fromSequence) {
		this.fromSequence = Objects.requireNonNull(fromSequence);
		return this;
	}

	public Max35Text getToSequence() {
		return toSequence;
	}

	public SequenceRange1Choice setToSequence(Max35Text toSequence) {
		this.toSequence = Objects.requireNonNull(toSequence);
		return this;
	}

	public List<SequenceRange1> getFromToSequence() {
		return fromToSequence == null ? fromToSequence = new ArrayList<>() : fromToSequence;
	}

	public SequenceRange1Choice setFromToSequence(List<SequenceRange1> fromToSequence) {
		this.fromToSequence = Objects.requireNonNull(fromToSequence);
		return this;
	}

	public List<Max35Text> getEqualSequence() {
		return equalSequence == null ? equalSequence = new ArrayList<>() : equalSequence;
	}

	public SequenceRange1Choice setEqualSequence(List<Max35Text> equalSequence) {
		this.equalSequence = Objects.requireNonNull(equalSequence);
		return this;
	}

	public List<Max35Text> getNotEqualSequence() {
		return notEqualSequence == null ? notEqualSequence = new ArrayList<>() : notEqualSequence;
	}

	public SequenceRange1Choice setNotEqualSequence(List<Max35Text> notEqualSequence) {
		this.notEqualSequence = Objects.requireNonNull(notEqualSequence);
		return this;
	}
}