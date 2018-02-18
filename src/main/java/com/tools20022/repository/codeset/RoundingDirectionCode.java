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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.RoundingDirectionCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the rounding direction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.RoundingDirectionCode#Full
 * RoundingDirectionCode.Full}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode#NoFraction
 * RoundingDirectionCode.NoFraction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode#ProRate
 * RoundingDirectionCode.ProRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode#RoundUp
 * RoundingDirectionCode.RoundUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode#RoundDown
 * RoundingDirectionCode.RoundDown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode#RoundToNearest
 * RoundingDirectionCode.RoundToNearest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode#IssueFraction
 * RoundingDirectionCode.IssueFraction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode#DiscussFirst
 * RoundingDirectionCode.DiscussFirst}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode#Specific
 * RoundingDirectionCode.Specific}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode#Standard
 * RoundingDirectionCode.Standard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode#Retain
 * RoundingDirectionCode.Retain}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"FULL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RoundingDirectionCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the rounding direction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RoundingDirectionCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Pre-allocate shares only if fully dealt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode
	 * RoundingDirectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FULL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::PRCO//FULL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Full"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Pre-allocate shares only if fully dealt."</li>
	 * </ul>
	 */
	public static final RoundingDirectionCode Full = new RoundingDirectionCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::PRCO//FULL"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Full";
			definition = "Pre-allocate shares only if fully dealt.";
			owner_lazy = () -> com.tools20022.repository.codeset.RoundingDirectionCode.mmObject();
			codeName = "FULL";
		}
	};
	/**
	 * No fractional shares are allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode
	 * RoundingDirectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOFR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::PRCO//NOFR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoFraction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "No fractional shares are allowed."</li>
	 * </ul>
	 */
	public static final RoundingDirectionCode NoFraction = new RoundingDirectionCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::PRCO//NOFR"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoFraction";
			definition = "No fractional shares are allowed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RoundingDirectionCode.mmObject();
			codeName = "NOFR";
		}
	};
	/**
	 * In case of a partial fill, pro-rate the allocations.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode
	 * RoundingDirectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PROR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::PRCO//PROR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "In case of a partial fill, pro-rate the allocations."</li>
	 * </ul>
	 */
	public static final RoundingDirectionCode ProRate = new RoundingDirectionCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::PRCO//PROR"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProRate";
			definition = "In case of a partial fill, pro-rate the allocations.";
			owner_lazy = () -> com.tools20022.repository.codeset.RoundingDirectionCode.mmObject();
			codeName = "PROR";
		}
	};
	/**
	 * Round up to the nearest whole number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode
	 * RoundingDirectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RDUP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::PRCO//RDUP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundUp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Round up to the nearest whole number."</li>
	 * </ul>
	 */
	public static final RoundingDirectionCode RoundUp = new RoundingDirectionCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::PRCO//RDUP"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RoundUp";
			definition = "Round up to the nearest whole number.";
			owner_lazy = () -> com.tools20022.repository.codeset.RoundingDirectionCode.mmObject();
			codeName = "RDUP";
		}
	};
	/**
	 * Round down to the nearest whole number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode
	 * RoundingDirectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RDWN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::PRCO//RDWN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundDown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Round down to the nearest whole number."</li>
	 * </ul>
	 */
	public static final RoundingDirectionCode RoundDown = new RoundingDirectionCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::PRCO//RDWN"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RoundDown";
			definition = "Round down to the nearest whole number.";
			owner_lazy = () -> com.tools20022.repository.codeset.RoundingDirectionCode.mmObject();
			codeName = "RDWN";
		}
	};
	/**
	 * Round up or down to the nearest whole number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode
	 * RoundingDirectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundToNearest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Round up or down to the nearest whole number."</li>
	 * </ul>
	 */
	public static final RoundingDirectionCode RoundToNearest = new RoundingDirectionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RoundToNearest";
			definition = "Round up or down to the nearest whole number.";
			owner_lazy = () -> com.tools20022.repository.codeset.RoundingDirectionCode.mmObject();
			codeName = "STAN";
		}
	};
	/**
	 * Do not round.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode
	 * RoundingDirectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DIST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueFraction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Do not round."</li>
	 * </ul>
	 */
	public static final RoundingDirectionCode IssueFraction = new RoundingDirectionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IssueFraction";
			definition = "Do not round.";
			owner_lazy = () -> com.tools20022.repository.codeset.RoundingDirectionCode.mmObject();
			codeName = "DIST";
		}
	};
	/**
	 * Do not pro-rate; discuss first.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode
	 * RoundingDirectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TALK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 591 value 1</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiscussFirst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Do not pro-rate; discuss first."</li>
	 * </ul>
	 */
	public static final RoundingDirectionCode DiscussFirst = new RoundingDirectionCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "591 value 1"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DiscussFirst";
			definition = "Do not pro-rate; discuss first.";
			owner_lazy = () -> com.tools20022.repository.codeset.RoundingDirectionCode.mmObject();
			codeName = "TALK";
		}
	};
	/**
	 * Pre-allocate according to the amounts shown in a linked allocation
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode
	 * RoundingDirectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::PRCO//SPEC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Specific"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Pre-allocate according to the amounts shown in a linked allocation instruction."
	 * </li>
	 * </ul>
	 */
	public static final RoundingDirectionCode Specific = new RoundingDirectionCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::PRCO//SPEC"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Specific";
			definition = "Pre-allocate according to the amounts shown in a linked allocation instruction.";
			owner_lazy = () -> com.tools20022.repository.codeset.RoundingDirectionCode.mmObject();
			codeName = "SPEC";
		}
	};
	/**
	 * Indicates that if the fraction is greater than or equal to 0.5 of the
	 * value should be rounded up; otherwise rounded down.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode
	 * RoundingDirectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSTD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Standard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that if the fraction is greater than or equal to 0.5 of the value should be rounded up; otherwise rounded down."
	 * </li>
	 * </ul>
	 */
	public static final RoundingDirectionCode Standard = new RoundingDirectionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Standard";
			definition = "Indicates that if the fraction is greater than or equal to 0.5 of the value should be rounded up; otherwise rounded down.";
			owner_lazy = () -> com.tools20022.repository.codeset.RoundingDirectionCode.mmObject();
			codeName = "SSTD";
		}
	};
	/**
	 * Indicates that fractional value should be retained; no rounding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode
	 * RoundingDirectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RETA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Retain"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that fractional value should be retained; no rounding."</li>
	 * </ul>
	 */
	public static final RoundingDirectionCode Retain = new RoundingDirectionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Retain";
			definition = "Indicates that fractional value should be retained; no rounding.";
			owner_lazy = () -> com.tools20022.repository.codeset.RoundingDirectionCode.mmObject();
			codeName = "RETA";
		}
	};
	final static private LinkedHashMap<String, RoundingDirectionCode> codesByName = new LinkedHashMap<>();

	protected RoundingDirectionCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("FULL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RoundingDirectionCode";
				definition = "Specifies the rounding direction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RoundingDirectionCode.Full, com.tools20022.repository.codeset.RoundingDirectionCode.NoFraction,
						com.tools20022.repository.codeset.RoundingDirectionCode.ProRate, com.tools20022.repository.codeset.RoundingDirectionCode.RoundUp, com.tools20022.repository.codeset.RoundingDirectionCode.RoundDown,
						com.tools20022.repository.codeset.RoundingDirectionCode.RoundToNearest, com.tools20022.repository.codeset.RoundingDirectionCode.IssueFraction, com.tools20022.repository.codeset.RoundingDirectionCode.DiscussFirst,
						com.tools20022.repository.codeset.RoundingDirectionCode.Specific, com.tools20022.repository.codeset.RoundingDirectionCode.Standard, com.tools20022.repository.codeset.RoundingDirectionCode.Retain);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Full.getCodeName().get(), Full);
		codesByName.put(NoFraction.getCodeName().get(), NoFraction);
		codesByName.put(ProRate.getCodeName().get(), ProRate);
		codesByName.put(RoundUp.getCodeName().get(), RoundUp);
		codesByName.put(RoundDown.getCodeName().get(), RoundDown);
		codesByName.put(RoundToNearest.getCodeName().get(), RoundToNearest);
		codesByName.put(IssueFraction.getCodeName().get(), IssueFraction);
		codesByName.put(DiscussFirst.getCodeName().get(), DiscussFirst);
		codesByName.put(Specific.getCodeName().get(), Specific);
		codesByName.put(Standard.getCodeName().get(), Standard);
		codesByName.put(Retain.getCodeName().get(), Retain);
	}

	public static RoundingDirectionCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RoundingDirectionCode[] values() {
		RoundingDirectionCode[] values = new RoundingDirectionCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RoundingDirectionCode> {
		@Override
		public RoundingDirectionCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RoundingDirectionCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}